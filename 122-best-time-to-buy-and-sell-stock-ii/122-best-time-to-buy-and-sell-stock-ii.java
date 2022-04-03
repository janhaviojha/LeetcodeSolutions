class Solution {
    public int maxProfit(int[] prices) {
        int buyday = 0;
        int sellday = 0;
        int maxprofit =0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>=prices[i-1]){
                sellday ++;
            }
            else{
                maxprofit += (prices[sellday]-prices[buyday]);
                buyday=sellday=i;
              
            }
            if(i==n-1) 
                maxprofit += prices[sellday]-prices[buyday];
            
        }
        return maxprofit;
    }
}