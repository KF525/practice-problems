package graphs.dfs;

import java.util.*;

/**
 * For this problem we are trying to determine if two nodes have a relationship, ie that when we traverse one node we eventually reach the other node.
 * This is a depth-first-search solution
 * 1. Check if node1 is node 2 => If they are the same we are done
 * 2. Construct graph representation
 * Recursive:
 * 3. Traverse graph recursively looking for route - adding visited nodes to our set as we go
 * Base cases:
 *    CurrentNode == desiredNode > We are done, we found a route and return true
 *    Node has no relations or all relations have already been visited > we have not found a route, return false
 *
 * Questions: Are we explicitly given a startingNode or do we not know which node (since it is a directed graph) would
 * be the "parent" node. If we do not, I think we need to call the function twice --treating each node as the "parent" 
 * or starting node.
 * Time Complexity:
 */
public class RouteBetweenTwoNodesProblem {

    Boolean hasRoute(List<List<Integer>> nodes, Integer node1, Integer node2) {
        if (node1.equals(node2)) return true;
        Map<Integer, Set<Integer>> graph = constructGraph(nodes);
        Set<Integer> visited = new HashSet<>();
        visited.add(node1);
        return hasRouteHelperDFS(graph, node1, node2, visited);
    }

    private Boolean hasRouteHelperDFS(Map<Integer, Set<Integer>> graph , Integer currentNode,
                                      Integer desiredNode, Set<Integer> visited) {
        Boolean hasRoute = false;
        if (currentNode.equals(desiredNode)) {
            return true;
        }

        Set<Integer> relations = graph.getOrDefault(currentNode, Set.of());
        for (Integer relation: relations) {
            if (!visited.contains(relation)) {
                visited.add(relation);
                hasRoute = hasRouteHelperDFS(graph, relation, desiredNode, visited);
            }
        }

        return hasRoute;
    }

    private Map<Integer, Set<Integer>> constructGraph(List<List<Integer>> nodes) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (List<Integer> node : nodes) {
            Integer key = node.get(0);
            Integer newRelation = node.get(1);
            Set<Integer> updatedRelations = new HashSet<>();
            updatedRelations.add(newRelation);
            if (graph.containsKey(key)) {
                Set<Integer> relations = graph.get(key);
                updatedRelations.addAll(relations);
            }
            graph.put(key, updatedRelations);
        }
        return graph;
    }
}
