class Solution {
    public int rob(int[] nums) {
        int incl=nums[0];
        int excl=0;
        int oldincl;
        
        for(int i=1;i<nums.length;i++){
            oldincl=incl;
            incl=Math.max(excl+nums[i],incl);
            excl=oldincl;
        }
        return incl;
    }
}