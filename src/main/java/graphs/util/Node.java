package graphs.util;

public class Node {
    Integer data;

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    Node left;
    Node right;

    public Node(Integer data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }


}
