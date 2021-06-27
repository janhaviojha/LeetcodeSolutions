import java.util.*;
class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        ArrayList<String> s=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            Integer in= new Integer(nums[i]);
            s.add(in.toString());
        }
        Collections.sort(s,new Comparator<String>(){
            
            public int compare(String x,String y){
            String a=x+y;
            String b=y+x;
            
            return a.compareTo(b) > 0 ? -1 : 1;
            }
            
        });
                         
        String ans="";
        for(int i=0;i<s.size();i++){
            ans+=s.get(i);
        }
        
        
        return ans.startsWith("0") ? "0" : ans;
    }
        
        
}
