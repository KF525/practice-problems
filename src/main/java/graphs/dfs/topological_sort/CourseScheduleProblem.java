package graphs.dfs.topological_sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseScheduleProblem {

    /**
     * General approach to this problem: Depth First Search (dfs) -
     * 1. create a dependency map to show course prerequisite structure: Course => List[Prerequisites].
     * 2. start with given course and recursively traverse its dependencies.
     * 3. base cases:
     *    When we hit an entry that has no dependencies, we know that we can complete that course (true).
     *    When we attempt to take a course that has already been completed we can identify a cycle (false).
     * 4. we can short circuit as soon as we get a false value.
     *
     * Time complexity is O(c + p) where c is the number of courses and p are the number of prerequisites
     * Space complexity is O(c + p) -- creating a map size of c where each c points to all prerequisites
     *
     * Questions to ask/things to consider:
     * - Is it possible that input would be a disconnected graph?
     */
    public Boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> prerequisiteMap = buildPrerequisiteMap(numCourses, prerequisites);
        Set<Integer> completedCourses = new HashSet<>();

        return searchAllPrerequisites(prerequisiteMap, completedCourses);
    }

    /**
     * This will handle the case that we may be dealing with a disconnected graph
     */
    public Boolean searchAllPrerequisites(Map<Integer, Set<Integer>> prerequisiteMap, Set<Integer> completed) {
        Set<Integer> courses = prerequisiteMap.keySet();
        boolean canCompleteCourses = true;

        //TODO: Short circuit
        for (Integer course: courses) {
            if (!completed.contains(course)) {
                completed.add(course);
                canCompleteCourses = canCompleteCourses && searchCoursePrerequisites(prerequisiteMap, course, completed);
            }
        }
        return canCompleteCourses;
    }

    /**
     * This will assess validity of all (and only) nodes reachable by s
     */
    public Boolean searchCoursePrerequisites(Map<Integer, Set<Integer>> prerequisiteMap,
                                                                Integer course,
                                                                Set<Integer> completed) {
        Set<Integer> prerequisites = prerequisiteMap.get(course);

        //Order here matters!
        for (Integer prerequisite : prerequisites) {
            if(prerequisiteMap.get(prerequisite).isEmpty()) {
                return true;
            } else if (completed.contains(prerequisite)) {
                return false;
            } else {
                completed.add(prerequisite);
                return searchCoursePrerequisites(prerequisiteMap, prerequisite, completed);
            }
        }
        // I don't expect to ever hit this case
        return true;
    }

    /**
    * Build dependency map to reflect course relationships
    */
    public Map<Integer, Set<Integer>> buildPrerequisiteMap(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> prerequisiteMap = initializeDependencyMap(numCourses);
        for (int[] courses: prerequisites) {
            Integer course = courses[0];
            Integer dependency = courses[1];
            Set<Integer> preexistingDependencies = prerequisiteMap.getOrDefault(course, Set.of(dependency));
            Set<Integer> updatedDependencies = Stream.concat(preexistingDependencies.stream(),
                    Stream.of(dependency))
                    .collect(Collectors.toUnmodifiableSet());
            prerequisiteMap.put(course, updatedDependencies);
        }
        return prerequisiteMap;
    }

    /**
     * Initialize dependency map
     */
    private Map<Integer, Set<Integer>> initializeDependencyMap(int numCourses) {
        Map<Integer, Set<Integer>> prerequisiteMap = new HashMap<>();
        for (int i=0; i < numCourses; i++) {
            prerequisiteMap.put(i, Set.of());
        }
        return prerequisiteMap;
    }
}