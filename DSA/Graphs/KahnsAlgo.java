package DSA.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class KahnsAlgo {

    public static  void  TopoSort(ArrayList<Integer>[]graphs){
        int[] ind=new int[graphs.length];

        for(int i=0;i<graphs.length;i++){
            for(int j=0;j<graphs[i].size();j++){
                int dest=graphs[i].get(j);
                ind[dest]+=1;
            }
        }
    
        
        Queue<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> order=new ArrayList<>();

        for(int i=0;i<ind.length;i++){
            if(ind[i]==0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()){
              int curr=q.poll();
              order.add(curr);
              for(int i=0;i<graphs[curr].size();i++){
                    int dest=graphs[curr].get(i);
                    ind[dest]-=1;
                    if(ind[dest]==0) {
                        q.add(dest);
                    }
                }
        }

        if (order.size() != graphs.length) {
            System.out.println("Graph has a cycle! Topological sort not possible.");
            return;
        }

        System.out.println("Topological Sort: " + order);


    }

    
   
    public static void main(String[] args){
    int nodes=6;
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
