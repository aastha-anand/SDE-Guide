package DSA.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class createGraph {
    
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
    public static void main(String[] args) {
        int nodes=5;
        ArrayList<Edge>[] graphs=new ArrayList[nodes];
        for(int i=0;i<nodes;i++){
            graphs[i]=new ArrayList<>();
        }

        graphs[0].add(new Edge(0,1 ,5));

        graphs[1].add(new Edge(1,2 ,1));
        graphs[1].add(new Edge(1,3 ,3));

        graphs[2].add(new Edge(2,1 ,1));
        graphs[2].add(new Edge(2,3 ,1));
        graphs[2].add(new Edge(2,4 ,2));

        graphs[3].add(new Edge(3,1 ,3));
        graphs[3].add(new Edge(3,2 ,1));

        graphs[4].add(new Edge(4,2 ,2));

        System.out.print("Enter the vertex for which you want to fetch neighbours: ");
        Scanner sc=new Scanner(System.in);
        int ver=sc.nextInt();

        System.out.print("Neighbours of Vertex "+ver+" is ");
        for(int i=0;i<graphs[ver].size();i++){
            Edge e=graphs[ver].get(i);
            System.out.print(e.dest +" ");
        }
        System.out.println();
    }
}
