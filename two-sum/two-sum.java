class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans=new int[2];
        int val=0;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(target-arr[i])){
                val=target-arr[i];
                ans[1]=i;
            }
            else{
                 hm.put(arr[i],target-i);
            }
        }
        // System.out.print(val);
            for(int i=0;i<arr.length;i++){
                if(arr[i]==val){
                    ans[0]=i;
                    break;
                }
            }
           
        
        return ans;
    }
}