package graphs.dfs;

import graphs.util.Node;

/**
 * Approach:
 *
 */
public class PruneBinaryTreeProblem {

    public Node pruneTree(Node root) {
        return pruneTreeHelper(root);
    }

    public Node pruneTreeHelper(Node root) {
        return null;
    }
//        if (root == null) {
//            return null;
//        }
//
//            if (root.data == 0) {
//                root.left = pruneTreeHelper(root.left);
//                root.right = pruneTreeHelper(root.right);
//            } else {
//                pruneTreeHelper(root.left);
//                pruneTreeHelper(root.right);
//            }
//        }
//        return null;
//    }
}
