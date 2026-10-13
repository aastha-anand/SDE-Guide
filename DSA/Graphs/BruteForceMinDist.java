package DSA.Graphs;

import java.util.ArrayList;

public class BruteForceMinDist {
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
    
    static boolean[] visited;
    
    public static int DijkstrasPath(ArrayList<Edge>[]graph,int src,int des,int cost){
        if(src==des){
            return cost;
        }
        visited[src]=true;
        int minCost=Integer.MAX_VALUE;

        for(int i=0;i<graph[src].size();i++){
             Edge e=graph[src].get(i);
             if(!visited[e.dest]) {
                int res=DijkstrasPath(graph, e.dest, des, cost+e.wt);
                if(res!=Integer.MAX_VALUE){
                    minCost=Math.min(minCost,res);
                }
             }
        }
        visited[src]=false;

        return minCost;
    }
    public static void main(String[] args){
        int nodes=6;
        ArrayList<Edge>[] graph=new ArrayList[nodes];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,3 ,2));
        graph[2].add(new Edge(2,3 ,2));
        graph[3].add(new Edge(3,1,3));
        graph[4].add(new Edge(4,1,5));
        graph[4].add(new Edge(4,0,4));
        graph[5].add(new Edge(5,0,5));
        graph[5].add(new Edge(5,2,6));
        
        int path=0;

        visited=new boolean[nodes];
        System.out.println("Distance: "+DijkstrasPath(graph,5,3,path));        
    }
}
