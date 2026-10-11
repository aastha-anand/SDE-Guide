package DSA.Graphs;

import java.util.ArrayList;

public class CycleUndirected {

    static boolean[]visited;

    public  static boolean cycle(ArrayList<Integer>[] graphs){
       for(int i=0;i<graphs.length;i++){
        if(!visited[i]){
            if(cycleutil(graphs,visited,i,-1)){
               return true;
            }
        }
       }
       return false;
    }
    public static boolean cycleutil(ArrayList<Integer>[]graphs,boolean[]visited,int curr,int parent){
    
        visited[curr]=true;

        for(int i=0;i<graphs[curr].size();i++){
            int neigh=graphs[curr].get(i);
            if (neigh == parent) continue;
            if(visited[neigh]) return true;
            if(cycleutil(graphs, visited,neigh, curr)) return true;
            
        }

        return  false;
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

        //graphs[3].add(1);
        //graphs[3].add(4);
        //graphs[3].add(5);

        //graphs[4].add(2);
        //graphs[4].add(3);
        // graphs[4].add(5);

        // graphs[5].add(3);
        // graphs[5].add(4);
        // graphs[5].add(6);

        // graphs[6].add(5);

        visited=new boolean[graphs.length];

        System.out.println("Cycle: "+cycle(graphs));

    }
}
