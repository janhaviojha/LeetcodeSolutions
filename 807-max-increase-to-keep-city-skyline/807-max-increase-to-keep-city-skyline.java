class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length;
        int cols = rows;
        int[] maxrow = new int[rows];
        int[] maxcol = new int[cols];
        int sum =0;       
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                maxrow[i]= Math.max(maxrow[i],grid[i][j]);
                maxcol[j] = Math.max(maxcol[j],grid[i][j]);
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum+= Math.min(maxrow[i],maxcol[j])-grid[i][j];
            }
        }
        return sum;
    }
}