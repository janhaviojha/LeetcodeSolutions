class Pair{
    int start;
    int end;
    
    Pair(int start,int end){
        this.start = start;
        this.end = end;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <=1){
            return intervals;
        }
        LinkedList<Pair> ll = new LinkedList<>();
        for(int[] temp : intervals){
            ll.add(new Pair(temp[0],temp[1]));
        }
        Collections.sort(ll,new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return a.start - b.start;
            }
        });
        LinkedList<Pair> res = new LinkedList<>();
        
        for(Pair p : ll){
            if(res.isEmpty() || p.start > res.getLast().end){
                res.add(p);
            }
            else{
                if(p.start <= res.getLast().end){
                    res.getLast().end = Math.max(res.getLast().end,p.end);
                }
            }
        }
        int[][] ans = new int[res.size()][2];
        int count =0;
        for(Pair p : res){
            ans[count][0] = p.start;
            ans[count][1] = p.end;
            count++;
        }
        return ans;
        
    }
}