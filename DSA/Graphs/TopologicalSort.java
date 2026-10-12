package DSA.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;


public class TopologicalSort {

    public static void TopoSort(ArrayList<Integer>[]graphs){
        boolean[] visited=new boolean[graphs.length];
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<graphs.length;i++){
            if(!visited[i]) ToposortUtil(graphs,i,visited,stack);
        }
        while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
    }
    public static void ToposortUtil(ArrayList<Integer>[] graphs,int curr,boolean[]visited,Deque<Integer>stack){
        visited[curr]=true;
        for(int i=0;i<graphs[curr].size();i++){
            int neigh=graphs[curr].get(i);
            if(!visited[neigh]) {
                ToposortUtil(graphs, neigh, visited, stack);
            }
        }
        stack.push(curr);
    }
    public static void main(String[] args){
    int nodes=7;
        ArrayList<Integer>[] graphs=new ArrayList[nodes];
        for(int i=0;i<nodes;i++){
            graphs[i]=new ArrayList<>();
        }

        //graphs[0].add(1);
        //graphs[0].add(2);

        // graphs[1].add(0);
        // graphs[1].add(3);

        //graphs[2].add(1);
        graphs[2].add(3);

        graphs[3].add(1);
        //graphs[3].add(4);
        //graphs[3].add(5);

        graphs[4].add(1);
        graphs[4].add(0);
        // graphs[4].add(5);

        graphs[5].add(0);
        graphs[5].add(2);
        
        // graphs[5].add(6);

        // graphs[6].add(5);


        TopoSort(graphs);
    }
}
