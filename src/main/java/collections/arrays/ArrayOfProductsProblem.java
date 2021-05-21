package collections.arrays;

public class ArrayOfProductsProblem {
    /**
     * If division were allowed, it would be fairly straightforward -get the total product and then divide by each value at each index and that would be the new value for that index.
     * Other approach:
     * These value for a given index can be reasoned about as everything to the left of index i * everything to the right of index i. And when there is no left or right (index 0 or index arr.length - 1) that left or right value is 1 respectively.
     *
     * Walk through example:
     *  {8, 10, 2}
     *
     *  left = 1;
     *  right = 10 * 2;
     *  left = 8
     *  right = 2
     *  left = 8 * 10
     *  right = 1
     */
    public int[] arrayOfArrayProducts(int[] arr) {
        int left = 1;
        int right = getRightValue(arr, 0);
        int[] productArray = new int[arr.length];

        for (int i=0; i < arr.length; i++) {
            productArray[i] = left * right;
            left = left * arr[i]; // new left
            right = getRightValue(arr, i + 1); // new right
        }
        return productArray;
    }

    private int getRightValue(int[] arr, Integer currentIndex) {
        int rightValue = 1;
        for (int i=currentIndex + 1; i < arr.length; i++) {
            rightValue = rightValue * i;
        }
        return rightValue;
    }
}

