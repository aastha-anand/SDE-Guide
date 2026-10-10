package DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bfs {

    public static  void BFSsearch(ArrayList<Integer>[] graphs){
        LinkedList<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[graphs.length];
        
        q.add(0);
        while(!q.isEmpty()){
           int curr= q.pop();
           if(visited[curr]) continue;
           else{
            System.out.print(curr+" ");
            visited[curr]=true;
            for(int i=0;i<graphs[curr].size();i++){
                q.add(graphs[curr].get(i));
            }
           }
        }

           
           
    }
    public static void main(String[] args) {
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
        graphs[3].add(5);

        graphs[4].add(2);
        graphs[4].add(3);
        graphs[4].add(5);

        graphs[5].add(3);
        graphs[5].add(4);
        graphs[5].add(6);

        graphs[6].add(5);

        System.out.println("BFS");
        BFSsearch(graphs);

    }
}
