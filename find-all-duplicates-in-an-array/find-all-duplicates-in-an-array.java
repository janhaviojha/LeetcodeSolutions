import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : nums ){
            i = Math.abs(i);
            
            if(nums[i-1]<0)
                ans.add(i);
            
            else
                nums[i-1] = -1*nums[i-1];
        }
       
      
        return ans;
    }
}