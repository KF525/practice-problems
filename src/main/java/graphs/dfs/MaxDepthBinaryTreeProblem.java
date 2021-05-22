package graphs.dfs;

import graphs.util.Node;

/**
 * My first instinct is that this will be a dfs and that I will need some sort of helper method that gets the height of the tree. The answer would be the max height that's returned from all the different paths.
 *
 * Space complexity = O(1) we are not creating any additional structures to solve this problem
 * Time complexity = O(N) we are visiting up to every node in the tree
 */
public class MaxDepthBinaryTreeProblem {

    public int maxDepthBinaryTree(Node root) {
        if (root == null) return 0;

        int leftMaxHeight = getMaxHeight(root.getLeft());
        int rightMaxHeight = getMaxHeight(root.getRight());

        return 1 + Math.max(leftMaxHeight, rightMaxHeight);
    }

    // This is recursive -- we want to continue to count nodes until we reach a leaf node
    public int getMaxHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getMaxHeight(node.getLeft()), getMaxHeight(node.getRight()));
    }
}
