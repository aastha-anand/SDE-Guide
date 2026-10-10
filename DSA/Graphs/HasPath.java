package DSA.Graphs;

import java.util.ArrayList;

public class HasPath {
    static boolean[] visited;

    public static boolean HasPath(ArrayList<Integer>[]graph,int src,int des){
         if(src==des) return true;
         visited[src]=true;
         for(int i=0;i<graph[src].size();i++){
            int neigh=graph[src].get(i);
            if(!visited[neigh] && HasPath(graph,neigh,des)) return true;
            return false;
         }
         return false;
    }
    public static void main(String[] args){
        int nodes=7;
        ArrayList<Integer>[] graphs=new ArrayList[nodes];
        for(int i=0;i<nodes;i++){
            graphs[i]=new ArrayList<>();
        }

        graphs[0].add(1);
        graphs[0].add(2);

        graphs[1].add(0);
        graphs[1].add(3);

        graphs[2].add(0);
        graphs[2].add(4);

        graphs[3].add(1);
        graphs[3].add(4);
        //graphs[3].add(5);

        graphs[4].add(2);
        graphs[4].add(3);
        //graphs[4].add(5);

        graphs[5].add(3);
        graphs[5].add(4);
        graphs[5].add(6);

        graphs[6].add(5);

        visited=new boolean[graphs.length];
        System.out.println("Has Path: "+ HasPath(graphs,0,5));
    }
}
