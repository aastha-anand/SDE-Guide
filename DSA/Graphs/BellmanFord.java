package DSA.Graphs;

import java.util.ArrayList;

public class BellmanFord {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    
    public static void BellmanPath(ArrayList<Edge>[]graph,int src){
       int []dis=new int[graph.length];
       for(int i=0;i<graph.length;i++){
         dis[i]=Integer.MAX_VALUE;
       }
       dis[src]=0;
       for(int i=0;i<graph.length-1;i++){
        for(int j=0;j<graph.length;j++){
            for(int k=0;k<graph[j].size();k++){
                Edge e=graph[j].get(k);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt < dis[v]){
                    dis[v]=dis[u]+wt;
                }
            }
        }
    }
       for(int d:dis) System.out.print(d+" ");
       
    }
    public static void main(String[] args){
        int nodes=6;
        ArrayList<Edge>[] graph=new ArrayList[nodes];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

       graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 5));
        graph[1].add(new Edge(1, 2, -2));
        graph[1].add(new Edge(1, 3, 2));
        graph[2].add(new Edge(2, 3, 3));
     
        BellmanPath(graph,0);        
    }
}
