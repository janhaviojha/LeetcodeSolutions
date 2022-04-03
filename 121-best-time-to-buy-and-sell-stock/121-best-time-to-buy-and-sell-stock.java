class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            minsofar = Math.min(minsofar,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-minsofar);
        }
         return maxprofit;
    }
    
   
}

//ab tak(curr pos in array) jo min tha uske saath curr price minus karte jao to find profit, jo max profit aayega wahi ans hoga.
