class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        int[][] numways = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(obstacleGrid[i][j]==0)
                    numways[i][j] = obstacleGrid[i][j];
                else
                    numways[i][j] = -1;
            }
        }
        for(int i=0;i<rows;i++){
            if(numways[i][0]!=-1){
                numways[i][0]=1;
            }
            else break;
        }
         for(int j=0;j<columns;j++){
            if(numways[0][j]!=-1){
                numways[0][j]=1;
            }
             else break;
        }
        if(obstacleGrid[0][0]==-1){
            return 0;
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<columns;j++){
                if(numways[i][j]==-1){
                    continue;
                }
                if(numways[i-1][j]!=-1){
                    numways[i][j] += numways[i-1][j];
                }
                if(numways[i][j-1]!=-1){
                    numways[i][j] += numways[i][j-1];
                }
            }
        }
        if(obstacleGrid[rows-1][columns-1]==1){
            return 0;
        }
        else{
            return numways[rows-1][columns-1];
        }
    }
}