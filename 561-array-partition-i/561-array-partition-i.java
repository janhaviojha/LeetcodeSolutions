// the optimal pairing will be the pairing of elemnts after sorting it
//like for 1 2 2 5 6 6
//pairs will be 1,2  2,5 and 6,6
//and then just choose min of each of the three pairs and add it.
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int sum =0;
        Arrays.sort(nums);
        for(int i=1;i<n;i+=2){
            sum += Math.min(nums[i],nums[i-1]);
        }
        return sum;
    }
}
