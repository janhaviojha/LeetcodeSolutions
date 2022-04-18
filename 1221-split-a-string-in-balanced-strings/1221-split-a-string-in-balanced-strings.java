class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        //String temp = "";
        int R =0;
        int L =0;
        int count =0;
        for(int i=0;i<n;i++){
            if(R==L){
                R=0;
                L=0;
                count++;
            }
            if(s.charAt(i)=='R'){ 
                R++;
            }
            if(s.charAt(i)=='L'){
                L++;
            }
            
        }
        return count;
    }
}