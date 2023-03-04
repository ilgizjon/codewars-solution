package DataStructures.OrgraphWeight;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Node>>adjList = new ArrayList<>();

    public Graph(List<Edge>edges){
        int n = 0;

        for(Edge edge : edges){
            n = Integer.max(n, Integer.max(edge.src, edge.dest));
        }

        for(int i = 0; i<=n; i++){
            adjList.add(i, new ArrayList<>());
        }

        for(Edge e : edges){
            adjList.get(e.src).add(new Node(e.dest, e.weight));
        }
    }

    public static void printGraph(Graph graph){
        int src = 0;
        int n = graph.adjList.size();

        while(src < n){
            for(Node edge : graph.adjList.get(src)){
                System.out.print(src+" --> "+edge+"\t");
            }
            System.out.println();
            src++;
        }
    }

}