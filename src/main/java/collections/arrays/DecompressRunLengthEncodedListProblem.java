package collections.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Approach: Keep track of two pointers, the frequency and the value. For each grouping, add the appropriate value
 * to a list frequency times. Then at the end of this process, we need to return the list to a primitive array since that
 * is what they are expecting.
 * Time complexity: We move through the list 2 at a time but then at the end we iterate through a whole list. Perhaps something like
 * O(m) + O(n/2) where m is the total frequency and n is the size of the initial array.
 * Space complexity: O(m) where m is the total frequency [F,v,F,v,] => F + F
 */
public class DecompressRunLengthEncodedListProblem {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> decompressedList = new ArrayList<>();
        int frequencyPointer = 0;
        int valuePointer = 1;

        while (valuePointer < nums.length) {
            int currentFrequency = nums[frequencyPointer];
            int currentValue = nums[valuePointer];
            for (int i=1; i <= currentFrequency; i++) {
                decompressedList.add(currentValue);
            }
            frequencyPointer += 2;
            valuePointer += 2;
        }

        int[] finalList = new int[decompressedList.size()];
        for (int i=0; i < finalList.length; i++) {
            finalList[i] = decompressedList.get(i);
        }

        return finalList;
    }
}
