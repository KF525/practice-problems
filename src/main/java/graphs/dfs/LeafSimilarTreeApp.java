package graphs.dfs;

import graphs.util.Node;

public class LeafSimilarTreeApp {

    public static void main(String[] args) {
        Node tree1 = new Node(1, new Node(2, null, null),
                new Node(3, null, null));
        Node tree2 = new Node(1, new Node(2, null, null),
                new Node(3, null, null));

        Node tree3 = new Node(3, new Node(5,
                new Node(6, null, null), new Node(2, new Node(7, null, null), new Node(4, null,null))),
                new Node(1, new Node(9, null, null), new Node(8, null, null)));
        Node tree4 = new Node(3, new Node(5, new Node(6, null, null), new Node(7, null, null)),
                new Node(1, new Node(4, null, null), new Node(2, new Node(9, null, null), new Node(8, null, null))));

        LeafSimilarTreeProblem l = new LeafSimilarTreeProblem();
        //System.out.print(l.leafSimilar(tree1, tree2));
        System.out.print(l.leafSimilar(tree3, tree4));
    }
}
