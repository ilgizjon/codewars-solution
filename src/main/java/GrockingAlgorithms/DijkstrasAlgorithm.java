package GrockingAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgorithm {
    // the graph
    private static Map<String, Map<String, Double>> graph = new HashMap<>();
    private static List<String> processed = new ArrayList<>();

    private static String findLowestCostNode(Map<String, Double> costs) {
        Double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;

        for (Map.Entry<String, Double> node : costs.entrySet()) {
            Double cost = node.getValue();

            if (cost < lowestCost && !processed.contains(node.getKey())) {
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }
        System.out.println("Node with lowest cost is: " + lowestCostNode);
        return lowestCostNode;
    }

    public static void main(String[] args) {
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 5.0);
        graph.get("start").put("b", 2.0);

        graph.put("a", new HashMap<>());
        graph.get("a").put("d", 4.0);
        graph.get("a").put("c", 2.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 8.0);
        graph.get("b").put("c", 7.0);

        graph.put("d", new HashMap<>());
        graph.get("d").put("c", 6.0);
        graph.get("d").put("e", 3.0);


        graph.put("c", new HashMap<>());
        graph.get("c").put("e", 1.0);
        graph.put("e", new HashMap<>());

        // The costs table
        Map<String, Double> costs = new HashMap<>();
        costs.put("a", 5.0);
        costs.put("b", 2.0);
        costs.put("d", Double.POSITIVE_INFINITY);
        costs.put("c", Double.POSITIVE_INFINITY);
        costs.put("e", Double.POSITIVE_INFINITY);


        // the parents table
        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        String node = findLowestCostNode(costs);
        while (node != null) {
            Double cost = costs.get(node);

            Map<String, Double> neighbors = graph.get(node);

            for (String n : neighbors.keySet()) {
                System.out.println("Сосед: " + n);
                double newCost = cost + neighbors.get(n);
                // If it's cheaper to get to this neighbor by going through this node
                if (costs.get(n) > newCost) {
                    // ... update the cost for this node
                    costs.put(n, newCost);
                    System.out.println("Обновили его " + n + " стоимость: " + newCost);
                    // This node becomes the new parent for this neighbor.
                    parents.put(n, node);
                    System.out.println("Обновили родителя для " + n + " его родитель теперь: " + node);
                }
            }
            // Mark the node as processed
            processed.add(node);

            // Find the next node to process, and loop
            node = findLowestCostNode(costs);
        }

        System.out.println("Cost from the start to each node:");
        System.out.println(costs); // { a: 5, b: 2, fin: 6 }
    }
}