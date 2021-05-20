package graphs.dfs.topological_sort;

public class CourseScheduleApp {

    /**
     * Problem: Course Schedule
     * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
     * You are given an array prerequisites where prerequisites[i] = [ai, bi]
     * indicates that you must take course bi first if you want to take course ai.
     *
     * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
     * Return true if you can finish all courses. Otherwise, return false.
     */
    public static void main(String[] args) {
        CourseScheduleProblem p = new CourseScheduleProblem();
        int numCourses = 3;
        int[][] dependencies = {{0,1}, {0,2}, {2,1}};
        boolean canFinish = p.canFinish(numCourses, dependencies);
        System.out.println(canFinish);
    }
}

