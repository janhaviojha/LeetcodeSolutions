import java.util.*;
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] vis=new boolean[n];
        List<Integer> set=new ArrayList<>();
        for(List<Integer> l:edges){
            vis[l.get(1)]=true;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                set.add(i);
            }
        }
        
       
        return set;
    }
}