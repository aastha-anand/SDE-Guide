package DSA.Graphs;

import java.util.ArrayList;

public class FindAllPath {
    static boolean[]visited;
    public static void FindPaths(ArrayList<Integer>[]graphs,int src,int dest,String path){
        if(src==dest) {
            System.out.println(path+dest);
            return;
           
        }
        visited[src]=true;
        for(int i=0;i<graphs[src].size();i++){
            int curr=graphs[src].get(i);
            FindPaths(graphs,curr, dest, path+src+"->");
        }
        visited[src]=false;
    }
    public static void main(String[]args){
        int nodes=6;
        ArrayList<Integer>[] graphs=new ArrayList[nodes];
        for(int i=0;i<nodes;i++){
            graphs[i]=new ArrayList<>();
        }

        graphs[0].add(3);
        //graphs[0].add(2);

        // graphs[1].add(0);
        // graphs[1].add(3);

        //graphs[2].add(1);
        graphs[2].add(3);

        graphs[3].add(1);
        //graphs[3].add(4);
        //graphs[3].add(5);

        graphs[4].add(0);
        graphs[4].add(1);
        // graphs[4].add(5);

        graphs[5].add(0);
        graphs[5].add(2);
        
        // graphs[5].add(6);

        // graphs[6].add(5);


        String s=new String();
        visited=new boolean[nodes];
       FindPaths(graphs, 5, 1, s);

    }
}
