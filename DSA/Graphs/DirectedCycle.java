package DSA.Graphs;

import java.util.ArrayList;

public class DirectedCycle {

    public static boolean cycle(ArrayList<Integer>[]graphs){
        boolean[]visited=new boolean[graphs.length];
        boolean[]stack=new boolean[graphs.length];
        for(int i=0;i<graphs.length;i++){
            if(!visited[i]) 
                if(cycleUtil(graphs,i,visited,stack)){ 
                return true;
                }
        }
        return false;
    }

    public static boolean cycleUtil(ArrayList<Integer>[]graphs,int curr,boolean[]visited,boolean[]stack){
        visited[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graphs[curr].size();i++){
            int neigh=graphs[curr].get(i);
            if(stack[neigh]) return true;
            if(!visited[neigh] && cycleUtil(graphs, neigh, visited, stack)) return false;
        }
        stack[curr]=false;
        return false;
    }
    public static void main(String[] args){
        int nodes=7;
        ArrayList<Integer>[] graphs=new ArrayList[nodes];
        for(int i=0;i<nodes;i++){
            graphs[i]=new ArrayList<>();
        }

        graphs[0].add(1);
        //graphs[0].add(2);

        // graphs[1].add(0);
        // graphs[1].add(3);

        graphs[2].add(1);
        graphs[2].add(3);

        //graphs[3].add(1);
        graphs[3].add(4);
        //graphs[3].add(5);

        graphs[4].add(2);
        //graphs[4].add(3);
        // graphs[4].add(5);

        // graphs[5].add(3);
        // graphs[5].add(4);
        // graphs[5].add(6);

        // graphs[6].add(5);


        System.out.println("Cycle: "+cycle(graphs));

    }
}
