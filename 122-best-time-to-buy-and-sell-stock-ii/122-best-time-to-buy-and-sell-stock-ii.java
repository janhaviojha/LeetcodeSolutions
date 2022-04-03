class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int maxprofit =0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>=prices[i-1]){
                sell++;
            }
            else{
                maxprofit += (prices[sell]-prices[buy]);
                buy=sell=i;
              
            }
            if(i==n-1) 
                maxprofit += prices[sell]-prices[buy];
            
        }
        return maxprofit;
    }
}