class Solution {
    public int equalPairs(int[][] grid) {

        int ans = 0;
        
        //transpose matrix
        int transposedGrid[][] = new int[grid.length][grid.length];

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid.length; j++) {

                transposedGrid[i][j] = grid[j][i];            
            }
        }

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid.length; j++) {

                if (Arrays.equals(grid[i],transposedGrid[j])) {
                    ans++;
                }            
            }
        }

        return ans;

    }
}