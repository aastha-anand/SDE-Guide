package DSA.Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgo {
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

    static class Pair implements Comparable<Pair>{
        int node;
        int dis;

        public  Pair(int node,int dis){
            this.node=node;
            this.dis=dis;
        }

        @Override 
        public int compareTo(Pair p2){
             return Integer.compare(this.dis,p2.dis);
        }
    }
    

    
    public static int DijkstrasPath(ArrayList<Edge>[]graph,int src,int des,int cost){
       boolean[]vis=new boolean[graph.length];
       PriorityQueue<Pair>pq=new PriorityQueue<>();

       pq.add(new Pair(0, 0));
       int finalCost=0;

       while(!pq.isEmpty()){
        Pair curr=pq.remove();
        if(!vis[curr.node]){
            vis[curr.node]=true;
            finalCost+=curr.dis;
             
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                pq.add(new Pair(e.dest,e.wt));
            }
        }
       }


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
        
     
        System.out.println("Distance: "+DijkstrasPath(graph,5,3));        
    }
}
