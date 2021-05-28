package collections.arrays;

public class MoveZerosProblem {

    /**
     * Approach: start at the end of the array with two pointers, one tracking the index where we should
     * swap if we come across a 0 and the other pointer moving toward the start of the array, looking for 0s.
     * Enter a while loop and continue while the movingPointer is greater than or equal to 0.
     * If the value at the moving pointer index == 0, then we want to do a series of swaps until the that 0 is at
     * the end point spot and all the other integers have shifted up. Once the swaps are completed, we decrement the
     * end pointer and moving pointer and continue to look.
     *
     * Time complexity: O(n+m) where n is the size of the array and m are the number of swaps?
     */
    public void moveZeroes(int[] nums) {
        int endPointer = nums.length - 1;
        int movingPointer = nums.length - 1;

        while (movingPointer >= 0) {
            if (nums[endPointer] == 0) {
                endPointer--;
                movingPointer--;
            } else {
                if (nums[movingPointer] == 0) {
                    for (int i=movingPointer; i < endPointer; i++) {
                        swap(nums, i, i+1);
                    }
                    endPointer--;
                }
                movingPointer--;
            }
        }
    }

    private void swap(int[] nums, int zeroPointer, int nonZeroPointer) {
        nums[zeroPointer] = nums[nonZeroPointer];
        nums[nonZeroPointer] = 0;
    }

    /**
     * Here we are just shifted nonZero numbers and not concerned with swapping. We keep track our of endPointer
     * so we know once we finish looking at the array what indices we need to overwrite with that 0 value.
     *
     * [0,1,0,3,12]
     * [0,1,3,12,12]
     * [1,3,12,12,12]
     * [1,3,12,0,0]
     */
    public void moveZeroesLessSwapping(int[] nums) {
        int endPointer = nums.length - 1;
        int movingPointer = nums.length - 1;

        while (movingPointer >= 0) {
            if (nums[movingPointer] == 0) {
                for (int i=movingPointer; i < endPointer; i++) {
                    nums[i] = nums[i+1];
                }
                endPointer--;
            }
            movingPointer--;
        }

        for (int i=endPointer + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
