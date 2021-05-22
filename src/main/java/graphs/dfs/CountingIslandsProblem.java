package graphs.dfs;

public class CountingIslandsProblem {

    /**
     * General approach to this problem:
     * Start at a point on the map (0,0)
     * If it is 0 (water), continue to traverse
     * If it is 1 (land), then we increment our island count and begin a search for island boundaries:
     * We will look above, below, right, left (once all of these no longer hit land we are done):
     *    Base cases:
     *    If we end up on 0 (water) we found an island boundary
     *    If we go beyond the edge of the map, we treat it as 0 (water)
     * Otherwise, we are still on a 1 (land) and we keep going. Repeating this process of looking at its neighbors.
     * Questions: How do I not double count islands? This is the challenging piece.
     * Remember we can modify the grid as we go! Once we see a 1 (land), set it to 0 before we continue to recurse.
     * Time complexity: O(xy) where x is the width of the map and y is the height of the map
     * Space complexity: O(1) no new data structures were created, just modified
     */
    public Integer countIslands(char[][] islandMap) {
        /**
         * 1 1 0 1
         * 0 1 0 0
         * 0 0 1 0
         */
        Integer islandCount = 0;
        for (int x = 0; x < islandMap.length; x++) {
            for (int y = 0; y < islandMap[0].length; y++) {
                if (islandMap[x][y] == '0') continue;
                islandCount++;
                checkNeighbors(x,y, islandMap);
            }
        }
        return islandCount;
    }

    public void  checkNeighbors(Integer x, Integer y, char[][] map) {
        Boolean water = (x < 0 || y >= map.length || y < 0 || y >= map[0].length || map[x][y] == '0');
        if (!water) {
            map[x][y] = '0';
            checkNeighbors(x, y+1, map);
            checkNeighbors(x, y-1, map);
            checkNeighbors(x+1, y, map);
            checkNeighbors(x-1, y, map);
        }
    }
}
