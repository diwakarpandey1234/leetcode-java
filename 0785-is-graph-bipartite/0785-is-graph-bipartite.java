class Solution {

    // private boolean checkForBipartite(ArrayList<ArrayList<Integer>>adj,int[] color,int start){
    //         Queue<Integer>q=new LinkedList<>();
    //         color[start]=0;
    //         q.add(start);

    //         while(!q.isEmpty()){
    //             int node=q.poll();
    //             for(int adjNode:adj.get(node)){
    //                 if(color[adjNode]==-1){
    //                     color[adjNode]=1-color[node];
    //                     q.add(adjNode);
    //                 }else if(color[node]==color[adjNode])return false;
    //             }
    //         }

    //         return true;
    // }

    private boolean checkForBipartiteDFS(ArrayList<ArrayList<Integer>>adj,int col,int node,int[] color){

        color[node]=col;
        for(int adjNode:adj.get(node)){

            if(color[adjNode]==-1){
              if(!checkForBipartiteDFS(adj,1-col,adjNode,color))return false;
            }
            else if(color[adjNode]==col)return false;
        }

        return true;
    }


    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<graph[j].length;i++){
                int u=graph[j][i];
                adj.get(j).add(u);
                adj.get(u).add(j);
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){
             if(!checkForBipartiteDFS(adj,0,i,color))return false;
            }
        }
        return true;
    }
}