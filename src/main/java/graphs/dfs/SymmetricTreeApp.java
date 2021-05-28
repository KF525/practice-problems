package graphs.dfs;

import graphs.util.Node;

/**
 * Problem: Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTreeApp {

    public static void main(String[] args) {
        Node subtree1 = new Node(1, new Node(2, null, null),
                new Node(3, null, null));
        Node subtree2 = new Node(1, new Node(3, null, null),
                new Node(2, null, null));
        Node notMirrorTree = new Node(5, subtree1, subtree1);
        Node mirrorTree = new Node(6, subtree1, subtree2);

        SymmetricTreeProblem s = new SymmetricTreeProblem();
        System.out.println(s.isSymmetric(notMirrorTree));
        System.out.println(s.isSymmetric(mirrorTree));
    }
}
