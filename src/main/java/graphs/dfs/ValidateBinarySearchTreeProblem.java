package graphs.dfs;

import graphs.util.Node;

/**
 * First thoughts, this will also be a dfs. Goal is to explore the tree and return true if the entire tree observes BST properties. As soon as it fails to observe BST properties return false. We will know that it is a valid BST if we get to a leaf node without finding an invalid case.
 * The tricky part of this is we need to track the min and max of the tree as well because BST properties could be observed within a subtree. For each node, check if max value in left subtree is smaller than the node and min value in right subtree greater than the node. Keep track of the narrowing min and max allowed values as it goes, looking at each node only once. The initial values for min and max should be INT_MIN and INT_MAX — they narrow from there.
 * This method is not applicable if there are duplicate elements with value INT_MIN or INT_MAX.
 * Time complexity: O(N) where N is the number of nodes.
 * Space complexity: O(1) if call stack not considered; O(N) if call stack is considered.
 */
public class ValidateBinarySearchTreeProblem {

    public boolean isValidBinarySearchTree(Node root) {
        return validateBinarySearchTreeHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Everything to the left should be less than its parent, everything to the right should be less than the root
     * Everything to the right should be larger than parent, everything to the left should be less than the root
     */
    public boolean validateBinarySearchTreeHelper(Node currentNode, Integer min, Integer max) {
        if (currentNode == null) {
            return true;
        }

        if (currentNode.data < min || currentNode.data > max) {
            return false;
        }

        return (validateBinarySearchTreeHelper(currentNode.left, min, currentNode.data-1)) &&
                (validateBinarySearchTreeHelper(currentNode.right, currentNode.data+1, max));
    }
}
