package graphs.dfs;

import graphs.util.Node;

public class ValidateBinarySearchTreeApp {
    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     *
     * A valid BST is defined as follows:
     *
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     */
    public static void main(String[] args) {
        Node validBST = new Node(4, new Node(2, new Node(1, null, null),
                new Node(3, null, null)), new Node(5, null, null));
        Node invalidBST = new Node(4, new Node(2, new Node(1, null, null),
                new Node(5, null, null)), new Node(5, null, null));
        ValidateBinarySearchTreeProblem v = new ValidateBinarySearchTreeProblem();
        System.out.println(v.isValidBinarySearchTree(validBST));
        System.out.println(v.isValidBinarySearchTree(invalidBST));
    }
}
