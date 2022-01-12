class Solution {
    public int countPrimes(int n) {
        
        boolean arr[] = new boolean[n+1];
        for(int i=0;i<n;i++){
            arr[i]= true;
        }
        
        arr[0] = false;
        if(n>=1)
        arr[1] = false;
        
        int count =0;
        
        for(int i=2;i<n;i++){
            
            if(arr[i]==true){
                count++;
                //System.out.print(i+" ");
                
                for(int j=2*i;j<n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        return count;
        
    }
}