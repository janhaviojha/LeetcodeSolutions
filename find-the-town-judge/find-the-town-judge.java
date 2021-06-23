class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree= new int[n+1];
        int[] outDegree=new int[n+1];
        int count=0;
        int judge=-1;
        
        for(int[] arr:trust){
            outDegree[arr[0]]++;
            inDegree[arr[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(outDegree[i]==0 && inDegree[i]==n-1){
                judge=i;
                count++;
               
            }
        }
        if(count==1){
            return judge;
        }
        return -1;
    }
}