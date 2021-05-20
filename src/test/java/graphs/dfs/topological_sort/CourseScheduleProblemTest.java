package graphs.dfs.topological_sort;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleProblemTest {

    @Test
    public void canFinishReturnsTrueIfAllCoursesCanBeCompleted() {
        int courses = 5;
        int[][] dependencies = {{0,1}, {0,2}, {1,3}, {1,4}, {3,4}};
        CourseScheduleProblem p = new CourseScheduleProblem();

        boolean expectedCourseCompletion = p.canFinish(courses, dependencies);

        assertTrue(expectedCourseCompletion);
    }

    @Test
    public void canFinishReturnsFalseIfAllCoursesCannotBeCompleted() {
        int courses = 5;
        int[][] dependencies = {{0,1}, {0,2}, {2,0}, {1,3}, {1,4}, {3,4}};
        CourseScheduleProblem p = new CourseScheduleProblem();

        boolean expectedCourseCompletion = p.canFinish(courses, dependencies);

        assertFalse(expectedCourseCompletion);
    }

    @Test
    public void searchAllPrerequisitesReturnsListOfAllCompletedCourses() {
        Map<Integer, Set<Integer>> dependencyMap = Map.of(
                1, Set.of(),
                0, Set.of(1),
                2, Set.of(1,3),
                3, Set.of()
        );

        CourseScheduleProblem p = new CourseScheduleProblem();
        Set<Integer> completed = new HashSet<>();
        boolean canFinish = p.searchAllPrerequisites(dependencyMap, completed);

        assertTrue(canFinish);
    }

    @Test
    public void searchCoursePrerequisitesReturnsUpdatedListOfCompletedCourses() {
        Map<Integer, Set<Integer>> dependencyMap = Map.of(
                1, Set.of(),
                0, Set.of(1),
                2, Set.of(1,3),
                3, Set.of()
        );

        CourseScheduleProblem p = new CourseScheduleProblem();
        Set<Integer> visited = new HashSet<>();
        visited.add(2);
        boolean canFinish = p.searchCoursePrerequisites(dependencyMap, 2, visited);

        assertTrue(canFinish);
    }

    @Test
    public void dependencyMapDocumentsCourseRelationshipAccurately() {
        int[][] dependencies = {{0,1}, {2,1}, {2,3}};
        int courses = 4;
        CourseScheduleProblem p = new CourseScheduleProblem();
        Map<Integer, Set<Integer>> expectedMap = Map.of(
                1, Set.of(),
                0, Set.of(1),
                2, Set.of(1,3),
                3, Set.of()
        );

        Map<Integer, Set<Integer>> actualMap = p.buildPrerequisiteMap(courses, dependencies);

        assertEquals(courses, actualMap.size());
        assertEquals(expectedMap, actualMap);
    }
}