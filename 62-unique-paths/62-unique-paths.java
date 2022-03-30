class Solution {
    public int uniquePaths(int rows, int columns) {
        int[][] numways = new int[rows][columns];
        numways[0][0] = 1;
        for(int j=1;j<columns;j++){
            numways[0][j] = 1 ;
        }
        for(int i=1;i<rows;i++){
            numways[i][0] = 1;
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<columns;j++){
                numways[i][j] =  numways[i-1][j] + numways[i][j-1] ;
            }
        }
        return numways[rows-1][columns-1];
    }
}