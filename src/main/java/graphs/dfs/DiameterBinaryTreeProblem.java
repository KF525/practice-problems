package graphs.dfs;

import graphs.util.Node;

public class DiameterBinaryTreeProblem {

    public int diameterOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }

        //If the root is part of the longest diameter
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        //If the root is not part of the longest diameter
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);

        return Math.max(Math.max(ldiameter, rdiameter), Math.max(rightHeight, leftHeight) + 1);
    }

    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }
}
