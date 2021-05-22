package graphs.dfs;

import graphs.util.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthBinaryTreeProblemTest {

    @Test
    public void getMaxHeightReturnsLongestPathCount() {
        Node root = new Node(1,
                new Node(2, new Node(3, null, null), new Node(4, new Node(5, null, null), null)),
                new Node(6, new Node(7, null, new Node(8, null, new Node(9, null, new Node(10, null, null)))), null));
        MaxDepthBinaryTreeProblem m = new MaxDepthBinaryTreeProblem();
        int maxHeight = m.getMaxHeight(root);
        assertEquals(6, maxHeight);
    }

    @Test
    public void getMaxHeightReturnsLongestPathHandlesEmptyTree() {
        Node root = null;
        MaxDepthBinaryTreeProblem m = new MaxDepthBinaryTreeProblem();
        int maxHeight = m.getMaxHeight(root);
        assertEquals(0, maxHeight);
    }

    @Test
    public void maxDepthBinaryTreeHandlesNull() {
        Node root = null;
        MaxDepthBinaryTreeProblem m = new MaxDepthBinaryTreeProblem();
        int maxDepthBinaryTree = m.maxDepthBinaryTree(root);
        assertEquals(0, maxDepthBinaryTree);
    }
}