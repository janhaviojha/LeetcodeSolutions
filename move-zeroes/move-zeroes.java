class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        int j=0;
        
        while(j<nums.length && i<nums.length){
            if(nums[j]!=0){
                int t = nums[j];
                nums[j] = nums[i];
                nums[i]= t;
                j++;
                i++;
            }
            else{
                j++;
            }
        }
    }
}