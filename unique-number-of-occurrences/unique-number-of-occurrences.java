import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer i : arr){
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                hm.put(i,1);
        }
        Set<Integer> s = new HashSet<>();
            for(Integer i : hm.values()){
                s.add(i);
            }
        if(s.size()==hm.size())
            return true;
        else
            return false;
    }
}