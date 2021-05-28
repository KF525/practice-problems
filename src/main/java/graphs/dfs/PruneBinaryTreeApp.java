package graphs.dfs;


import graphs.util.Node;

public class PruneBinaryTreeApp {

    public static void main(String[] args) {
        Node tree = new Node(1, new Node(0, null, new Node(0, null, null)), new Node(1, null, null));
        PruneBinaryTreeProblem p = new PruneBinaryTreeProblem();
        p.pruneTree(tree);
    }
}
