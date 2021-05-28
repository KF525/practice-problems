package graphs.dfs;

import graphs.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Approach: Collect all the leaves from the two trees and compare. In this case, order matters.
 * So we will collect them into a structure that honors order (list). DFS search,
 * since we want to collect the leaves our base case cannot be null (since this means we are already off the tree. So we will first do a null check and only connect if we are sure the current root is not null. Our base case is when the root.left/root.right are both null. This is by definition a leaf. If it is, we add it to the list. Then we continue to explore the tree on root.left and root.right. Again, order matters here.
 * These trees are not guaranteed to be the same size! They just need to have the same leaf structure.
 * Time complexity: O(n1 + n2) where n is every node on the two trees - since we have to visit all nodes to get to the trees leaves.
 * Space complexity: O(m1 + m2) where m is the number of leaf nodes since we not creating a list that will hold all nodes (technically 2m but we drop the constant). When true, m will be the same size.
 */
public class LeafSimilarTreeProblem {
    public boolean leafSimilar(Node root1, Node root2) {
        List<Integer> treeOneLeaves = collectLeaves(root1, new ArrayList());
        List<Integer> treeTwoLeaves = collectLeaves(root2, new ArrayList());

        return treeOneLeaves.equals(treeTwoLeaves);
    }

    private List<Integer> collectLeaves(Node root, List<Integer> treeLeaves) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.println(root.data);
                treeLeaves.add(root.data);
            }

            collectLeaves(root.left, treeLeaves);
            collectLeaves(root.right, treeLeaves);
        }
        return treeLeaves;
    }
}
