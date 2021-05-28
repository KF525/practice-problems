package graphs.dfs;

import graphs.util.Node;

public class BasicTraversalApp {

    public static void main(String[] args) {
        Node tree = new Node(5, new Node(3, new Node(2, null, null), new Node(4, null, null)), new Node(9, new Node(7, new Node(6, null, null), new Node(8, null, null)), new Node(12, null, null)));
        BasicTraversalProblem b = new BasicTraversalProblem();

        System.out.println("inorder traversal");
        b.inorderTraversal(tree);
        System.out.println("preorder traversal");
        b.preorderTraversal(tree);
        System.out.println("postorder traversal");
        b.postorderTraversal(tree);
    }
}
