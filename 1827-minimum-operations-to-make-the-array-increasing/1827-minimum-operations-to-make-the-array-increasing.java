class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int max = 0;
        int maxIndex = 0;
        int count =0;
        for(int i=0;i<n;i++){
            if(nums[i]> max){
                max = nums[i];
                maxIndex = i;
            }
        }
       for(int i=1;i<n;i++){
           while(nums[i]<=nums[i-1]){
               nums[i]++;
               count++;
           }
           // while(nums[i]>nums[i-1]){
           //     nums[i-1]++;
           //     count++
           // }
       }
        // for(int i=0;i<maxIndex;i++){
        //     int diff = maxIndex - i;
        //     System.out.print(nums[i]);
        //     while(nums[i]<max-diff){
        //         nums[i]++;
        //         count++;
        //     }
                
        //}
//         for(int i=maxIndex+1;i<n;i++){
//             //System.out.print(nums[i]);
//              int diff = i - maxIndex;
//             while(nums[i]<max+diff){
//                 nums[i]++;
//                 count++;
//             }
                
//         }
        return count;
    }
}