package graphs.dfs;

import graphs.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 */
public class BinaryInorderTraversalProblem {

    public List<Integer> binaryInorderTraversal(Node currentNode) {
        return binaryInorderTraversalHelper(currentNode, new ArrayList<>());
    }

    public List<Integer> binaryInorderTraversalHelper(Node currentNode, List<Integer> inorderNodeList) {
        if (currentNode.left != null) {
            return binaryInorderTraversalHelper(currentNode.left, inorderNodeList);
        } else if (currentNode.right == null) {
            inorderNodeList.add(currentNode.data);
            return inorderNodeList;
        } else {
            return binaryInorderTraversalHelper(currentNode.right, inorderNodeList);
        }
    }
}
