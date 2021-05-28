package graphs.dfs;

import graphs.util.Node;

public class SearchBinaryTreeProblem {

    public Node searchBST(Node root, int val) {
        if (root == null) return null;
        if (root.data == val) {
            return root;
        }
        Node left = searchBST(root.left, val);
        Node right = searchBST(root.right, val);

        if (left == null) {
            return right;
        } else {
            return left;
        }
    }
}
