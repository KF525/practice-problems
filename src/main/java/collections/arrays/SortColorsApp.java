package collections.arrays;

import static collections.util.Display.printArr;

public class SortColorsApp {

    /**
     * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     *
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *
     * You must solve this problem without using the library's sort function.
     */
    public static void main(String[] args) {
        SortColorsProblem s = new SortColorsProblem();
        int[] colorsArray1 = {2,0,1,0,1,0,2};
        int[] colorsArray2 = {1,0,2,1,0,2};
        int[] colorsArray3 = {0,1,2,0,1,2};

        printArr(s.sortColors(colorsArray1));
        printArr(s.sortColors(colorsArray2));
        printArr(s.sortColors(colorsArray3));
    }
}
