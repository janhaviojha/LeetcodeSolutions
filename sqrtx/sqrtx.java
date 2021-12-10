class Solution {
    public int mySqrt(int x) {
        long s =0;
        long e = x;
        long mid = s+ (e-s)/2;
        int ans =0;
        while(s<=e){
            long sq = mid*mid;
            if(sq == x){
             return (int) mid;   
            }
            else if(sq>x){
                e = mid-1;
            }
            else {
                ans = (int) mid;
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
}