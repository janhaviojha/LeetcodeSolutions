class Solution {
    public boolean canJump(int[] arr) {
        int n=arr.length;
        
        int[] jumps = new int[n]; // dp array to store min jumps to that pos-->index of array from 0 
        jumps[0]=0; //0 jumps needed to reach 0th pos from 0th pos
        for(int i =1; i<n;i++){
            jumps[i] = Integer.MAX_VALUE; //initialising all pos except 0 to infinity, indicating they are not reachable at the moment
        }
        for(int i =0;i<n;i++){ //array for the pos which is to be reached
             
            for(int j=0;j<i;j++){ //array for all pos before i from where i can be reached

                if(arr[j]+j >= i && jumps[j] != Integer.MAX_VALUE){  //if the jump allowed from pos + pos is equal to the pos we want to reach ie if i is reachable from j
                                                                    //and second condition to check if j was reachable in the first place

                    jumps[i] = Math.min(jumps[i],jumps[j]+1); //storing the min value between what is already present in jumps[i], ie min jumps to reach that pos till now
                                                                // and the new jump from current j which would be jumps to reach j + 1 more jump
                }
            }
        }
        if(jumps[n-1]!=Integer.MAX_VALUE)
            return true; //min jumps to reach n from 0 is stored in this.
        else
            return false;
    }
}