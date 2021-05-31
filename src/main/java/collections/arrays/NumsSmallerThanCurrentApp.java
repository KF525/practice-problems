package collections.arrays;

import collections.util.Display;

public class NumsSmallerThanCurrentApp {

    public static void main(String[] args) {
        NumsSmallerThanCurrentProblem n = new NumsSmallerThanCurrentProblem();
        int[] array1 = {8,1,2,2,3};
        int[] array2 = {6,5,4,8};
        int[] array3 = {7,7,7,7};
        Display.printArr(n.smallerNumbersThanCurrent(array1));
        Display.printArr(n.smallerNumbersThanCurrent(array2));
        Display.printArr(n.smallerNumbersThanCurrent(array3));
    }
}
