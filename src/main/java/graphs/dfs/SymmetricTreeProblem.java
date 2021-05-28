package graphs.dfs;

import graphs.util.Node;

/**
 * My approach, recursive solution that continues to check the nodes until we are off the tree.
 * Base cases are:
 * 1. if both nodes are null then return true
 * 2. if one of the nodes is null but the other is not, the subtrees are not asymmetrical and return false
 * 3. If the nodes data are not equal return false.
 * Otherwise, so far the subtrees are symmetrical and we want to keep going.
 * This is checking if the subtrees are identical -- not mirror images.
 * Time complexity: O(N) where N is the number of nodes
 * Space complexity
 */
public class SymmetricTreeProblem {

    public boolean isSymmetric(Node root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node subtree1, Node subtree2) {
        //If both trees are empty, then they are mirror images
        if (subtree1 == null && subtree2 == null) {
            return true;
        }

        // For two trees to be mirror images, the following
        // three conditions must be true 1 - Their root
        // node's data must be same
        // 2 - left subtree of left
        // tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images
        if (subtree1 != null && subtree2 != null
                && subtree1.data.equals(subtree2.data))
            return (isMirror(subtree1.left, subtree2.right)
                    && isMirror(subtree1.right, subtree2.left));

        // if none of the above conditions is true then root1 and root2 are not mirror images
        return false;
    }
}
