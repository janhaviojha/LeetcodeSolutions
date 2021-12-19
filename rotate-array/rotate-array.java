class Solution {
    public void rotate(int[] nums, int k) {
        int pos =0;
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i+k>=nums.length){
                pos = (i+k)%nums.length;
            }
            else{
                pos = i+k;
            }
           
            temp[pos] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}