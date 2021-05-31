package collections.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Approach: Sort the list and then build up a map that captures integer -> the number of numbers smaller than that integer.
 * Then use the non-sorted array to get the correct value for the final array.
 * Space Complexity: O(n + m) where n is the size of the array and m is the unique number of integers represented in array.
 * You could probably do this without creating a new array to cut down on space complexity.
 * Time Complexity: O(n log n) -- we need to sort the list, then iterate through the sorted array once to build up the map, then we iterate through the final
 * array of similar size and enter in the values.
 */
public class NumsSmallerThanCurrentProblem {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNums = new int[nums.length];
        int[] originalArray = nums;
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i=0; i < sortedNums.length; i++) {
            if (!frequencyMap.containsKey(sortedNums[i])) {
                frequencyMap.put(sortedNums[i], i);
            }
        }

        for (int i=0; i < smallerNums.length; i++) {
            smallerNums[i] = frequencyMap.get(originalArray[i]);
        }

        return smallerNums;
    }
}
