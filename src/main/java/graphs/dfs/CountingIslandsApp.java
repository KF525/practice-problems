package graphs.dfs;

public class CountingIslandsApp {

    /**
     * Problem: Counting Islands
     * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
     *
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
     * (https://leetcode.com/problems/number-of-islands/)
     */
    public static void main(String[] args) {
        CountingIslandsProblem c = new CountingIslandsProblem();
        char[][] grid = { {'1','1','1','1','0'} , {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        System.out.print(c.countIslands(grid));
    }
}
