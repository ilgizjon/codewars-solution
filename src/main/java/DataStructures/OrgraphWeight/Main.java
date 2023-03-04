package DataStructures.OrgraphWeight;

import java.util.Arrays;
import java.util.List;

import static DataStructures.OrgraphWeight.Graph.printGraph;

public class Main {
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 6), new Edge(1, 2, 7), new Edge(2, 0, 5),
                new Edge(2, 1, 4), new Edge(3, 2, 10), new Edge(4, 5, 1),
                new Edge(5, 4, 3));

        // построить graph из заданного списка ребер
        Graph graph = new Graph(edges);

        // вывести представление списка смежности Graph
        printGraph(graph);
    }


}