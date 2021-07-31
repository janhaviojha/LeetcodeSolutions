class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
         int currentSum =0;
        int lastMax = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
             // lastMax = currentSum;
            currentSum = currentSum + arr[i];
            
            if(currentSum > lastMax){
                lastMax = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return lastMax;
    }
}