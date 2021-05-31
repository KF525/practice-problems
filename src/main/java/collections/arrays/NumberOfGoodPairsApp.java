package collections.arrays;

/**
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 */
public class NumberOfGoodPairsApp {

    public static void main(String[] args) {
        NumberOfGoodPairsProblem n = new NumberOfGoodPairsProblem();
        int[] pairs1 = {1,2,3,1,1,3};
        int[] pairs2 = {1,1,1,1};
        int[] pairs3 = {1,2,3};
        System.out.println(n.numberOfGoodPairs(pairs1));
        System.out.println(n.numberOfGoodPairs(pairs2));
        System.out.println(n.numberOfGoodPairs(pairs3));
    }
}
