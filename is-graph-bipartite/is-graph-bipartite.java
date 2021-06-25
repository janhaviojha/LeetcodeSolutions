class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int [] color=new int[n];
        Arrays.fill(color,-1);
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                color[0]=1;
                while(!q.isEmpty()){
                    Integer node=q.poll();
                    for(Integer j:graph[node]){
                        System.out.println(j);
                        if(color[j]==-1){
                            color[j]=1-color[node];
                            q.add(j);
                        }
                        else if(color[j]==color[node])
                            return false;
                    }
                }
                
            }
        }
        return true;
    }
}