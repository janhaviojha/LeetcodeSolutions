class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int minsofar=arr[0];
        int maxprofit=0;

        for(int i=0;i<n;i++){
            minsofar=Math.min(arr[i],minsofar);
            maxprofit=Math.max(maxprofit,arr[i]-minsofar);
        }
        return maxprofit;
    }
}