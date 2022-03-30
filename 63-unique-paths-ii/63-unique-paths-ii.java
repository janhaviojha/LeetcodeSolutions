class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        //making new array because have to initialize obstacles with -1
        int[][] numways = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(obstacleGrid[i][j]==0)
                    numways[i][j] = obstacleGrid[i][j];
                else
                    numways[i][j] = -1;
            }
        }
        //initialize first column
        for(int i=0;i<rows;i++){
            if(numways[i][0]!=-1){
                numways[i][0]=1;
            }
            else break;
        }
        //initialize first row
         for(int j=0;j<columns;j++){
            if(numways[0][j]!=-1){
                numways[0][j]=1;
            }
             else break;
        }
        //if first cell has obtacle e cannot reach end
        if(obstacleGrid[0][0]==-1){
            return 0;
        }
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<columns;j++){
                //if cell has obstacle skip it
                if(numways[i][j]==-1){
                    continue;
                }
                //if the previous cell did not have obstacle then add the num of ways to reach                  prev cell  to the num of ways to reach present cell 
                
                if(numways[i-1][j]!=-1){
                    numways[i][j] += numways[i-1][j];
                }
                if(numways[i][j-1]!=-1){
                    numways[i][j] += numways[i][j-1];
                }
            }
        }
        //if last cell has obstacle then we cannot reach it hence return 0 ways else return             ans
        if(obstacleGrid[rows-1][columns-1]==1){
            return 0;
        }
        else{
            return numways[rows-1][columns-1];
        }
    }
}