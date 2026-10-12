package DSA.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class Bipartite {

    public static boolean biapartite(ArrayList<Integer>[]graphs){
        
        int[]color=new int[graphs.length];
        Arrays.fill(color,-1);

        for(int i=0;i<graphs.length;i++){
            if(color[i]==-1){
                if(!biapartiteUtil(graphs,i,0,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean biapartiteUtil(ArrayList<Integer>[]graphs,int curr, int currColor,int[]color){
        color[curr]=currColor;
        
        for(int i=0;i<graphs[curr].size();i++){
            int neigh=graphs[curr].get(i);
            
            if(color[neigh]==color[curr]) return false;
            
            if(color[neigh]==-1) {
                color[neigh]=currColor;
                biapartiteUtil(graphs,neigh,currColor==1?0:1,color);
            }
        }
        return true;
    }
    public static void main(String args[]){
        int nodes=5;
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
        graphs[3].add(4);
        //graphs[3].add(5);

        graphs[4].add(2);
        graphs[4].add(3);
        // graphs[4].add(5);

        // graphs[5].add(3);
        // graphs[5].add(4);
        // graphs[5].add(6);

        // graphs[6].add(5);
        System.out.println("Bipartite graph: "+biapartite(graphs));
    }
}
