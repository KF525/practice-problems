package collections.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumsSmallerThanCurrentProblem {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNums = new int[nums.length];
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i=0; i < sortedNums.length; i++) {
            if (!frequencyMap.containsKey(nums[i])) {
                frequencyMap.put(nums[i], i);
            }
        }

        for (int i=0; i < smallerNums.length; i++) {
            smallerNums[i] = frequencyMap.get(nums[i]);
        }

        return smallerNums;
    }
}
