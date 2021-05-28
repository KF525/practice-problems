package graphs;

import graphs.util.Node;

public class IdenticalBinaryTreesProblem {

    public boolean isSameTree(Node p, Node q) {
        return isSameTreeHelper(p, q);
    }

    public boolean isSameTreeHelper(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null) {
            return false;
        }

        if (q == null) {
            return false;
        }

        if (p.data != q.data) {
            return false;
        }

        return isSameTreeHelper(p.left, q.left) &&
                isSameTreeHelper(p.right, q.right);
    }
}
