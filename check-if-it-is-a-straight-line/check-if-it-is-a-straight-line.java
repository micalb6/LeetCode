class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        if (coordinates.length == 2) {return true;}
            
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        int slopeX = x1 - x0;
        int slopeY = y1 - y0;

        for(int i = 2; i < coordinates.length; i++){

            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            if (slopeY * (xi-x0) != slopeX * (yi-y0)) {return false;}
        }

        
        return true;
    }
}