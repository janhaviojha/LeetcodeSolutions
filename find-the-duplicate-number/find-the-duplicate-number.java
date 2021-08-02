class Solution {
    public int findDuplicate(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();
        int index =0;
        for(int i =0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                index=i;
                break;
            }
            hs.add(nums[i]);
        }
        return nums[index];
    }
}