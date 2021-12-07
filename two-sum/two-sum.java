import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        int index1 =0;
        int index2=0;
        for(int i=0;i<nums.length;i++){
            int val = target- nums[i];
            if(hm.containsKey(val) && hm.get(val)!=i){
                index1 = i;
                index2 = hm.get(val);
                break;
            }
        }
               int[] ans = new int[2];
            if(index1<index2){
                ans[0]=index1;
                ans[1]=index2;
            }
        else{
            ans[0]=index2;
            ans[1]=index1;
        }
               
              
               return ans;
    }
}