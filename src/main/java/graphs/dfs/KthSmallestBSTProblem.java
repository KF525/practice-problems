package graphs.dfs;

import graphs.util.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * We could potentially do this if each node knows about its parent.
 * If we do not, we could also do an in order traversal, throw the nodes into a queue or array
 * and then take the kth element. This might not be the most efficient solution because
 * we have to load the whole tree into the queue or array. Although this implementation is with a queue,
 * I think an array would be more efficient because it would be a constant lookup at the end.
 */
public class KthSmallestBSTProblem {
    Queue<Integer> queue = new LinkedList<>();

    public Integer kthSmallest(Node root, Integer k) {
        addNodesToQueue(root);

        if (queue.size() < k) {
            return -1;
        }

        while (k > 0) {
            queue.remove();
            k--;
        }
        return queue.remove();
    }

    public void addNodesToQueue(Node root) {
        if (root == null) return;
        addNodesToQueue(root.left);
        queue.add(root.data);
        addNodesToQueue(root.right);

    }
}
