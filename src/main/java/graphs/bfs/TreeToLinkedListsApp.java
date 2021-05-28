package graphs.bfs;

import graphs.util.Node;

public class TreeToLinkedListsApp {

    public static void main(String[] args) {
        Node tree = new Node(1,
                new Node(2, new Node( 3, null, new Node(6, null, null)), null),
                new Node(4, null, new Node(5, null, null)));
        TreeToLinkedListProblem t = new TreeToLinkedListProblem();
        t.generateLinkedLists(tree);
    }
}
