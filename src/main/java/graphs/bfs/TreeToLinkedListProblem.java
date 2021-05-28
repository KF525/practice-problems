package graphs.bfs;

import graphs.util.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeToLinkedListProblem {

    /**
     * Since this problem is asking us to identify the various levels of a tree,
     * the first thing that comes to mind is bfs.
     * We need to know when we have reached the next level so I would perhaps modify
     * the node to also include data about its location in the tree.
     * 1. Set level and current level (actual level we are at in the tree) to 0. This is how we will know when to create a new list.
     * 2. Create a queue and enqueue the root along with information about its level.
     * 3. Create a new linked list for the first level in the tree.
     * 4. Then enter a while loop, while queue is not empty...
     *    a. Remove a node/current level from queue
     *    b. Check the current level value
     *    c. If that current level value is not equal to the level value - then we know we need to save the current list and start a new one.
     *       - add current list to the final list
     *       - increment the level
     *       - create a new list for the next level of nodes
     *    d. enqueue the left and right (if they exist)
     *    e. add the node to the current list
     * 5. Out of the while loop, add the last list to the final list before returning it.
     */

    public List<List<Node>> generateLinkedLists(Node root) {
        int level = 0;
        int currentLevel;
        Queue<NodeWithLevel> nodeLevelQueue = new LinkedList<>();
        nodeLevelQueue.add(new NodeWithLevel(root, level));
        List<List<Node>> nodeLinkedLists = new ArrayList<>();
        LinkedList<Node> linkedListLevel = new LinkedList<>();

        while (!nodeLevelQueue.isEmpty()) {
            NodeWithLevel nodeWithLevel = nodeLevelQueue.remove();
            currentLevel = nodeWithLevel.level;
            Node currentNode = nodeWithLevel.node;
            if (currentLevel != level) {
                nodeLinkedLists.add(linkedListLevel);
                level++;
                linkedListLevel = new LinkedList<>();
            }
            if (currentNode.left != null) {
                nodeLevelQueue.add(new NodeWithLevel(currentNode.left, currentLevel + 1));
            }
            if (currentNode.right != null) {
                nodeLevelQueue.add(new NodeWithLevel(currentNode.right, currentLevel + 1));
            }
            linkedListLevel.add(currentNode);
            }
        nodeLinkedLists.add(linkedListLevel);
        return nodeLinkedLists;
    }

    public class NodeWithLevel {
        public Node node;
        public int level;

        public NodeWithLevel(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}
