package graphs.bfs;

import java.util.List;

public class RouteBetweenTwoNodesApp {

    public static void main(String[] args) {
        RouteBetweenTwoNodesProblem r = new RouteBetweenTwoNodesProblem();

        List<List<Integer>>  nodesWithRoute = List.of(List.of(1,3), List.of(2,4), List.of(3,5),
                List.of(3,6), List.of(5,4), List.of(6,7));
        List<List<Integer>>  nodesWithoutRoute = List.of(List.of(1,3), List.of(2,4), List.of(3,5),
                List.of(3,6), List.of(5,4), List.of(8,7));

        System.out.print(r.hasRoute(nodesWithRoute, 1,7));
    }
}
