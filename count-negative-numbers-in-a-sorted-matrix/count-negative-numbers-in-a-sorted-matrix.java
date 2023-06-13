class Solution {
    public int countNegatives(int[][] grid) {
        
        int m = grid.length -1;
        int n = 0;
        int res = 0;
        while (m >= 0 && n <= grid[0].length -1) {

            if (grid[m][n] < 0) {
                res += grid[0].length - n;
                m -= 1;
            }
            else {
                n += 1;
            }
        }
        return res;
    }
}