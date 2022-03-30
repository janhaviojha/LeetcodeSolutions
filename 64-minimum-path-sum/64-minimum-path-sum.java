class Solution {
    public int minPathSum(int[][] cost) {
        int rows = cost.length;
        int columns = cost[0].length;
        //System.out.println(rows +" " + columns);
        int[][] mincost = new int[rows][columns];
        mincost[0][0] = cost[0][0];
        
        for(int j=1;j<columns;j++){
            mincost[0][j] = mincost[0][j-1] + cost[0][j];
        }
      
       
            for(int i=1;i<rows;i++){
                mincost[i][0] = mincost[i-1][0] + cost[i][0];
            }
        

        for(int i=1;i<rows;i++){
            for(int j=1;j<columns;j++){
                mincost[i][j] =  Math.min(mincost[i-1][j],mincost[i][j-1]) + cost[i][j];
            }
        }
        return mincost[rows-1][columns-1];
    }
}