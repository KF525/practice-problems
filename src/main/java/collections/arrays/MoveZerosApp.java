package collections.arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZerosApp {

    public static void main(String[] args) {
        MoveZerosProblem m = new MoveZerosProblem();
        int[] array = {0,1,0,3,12};
        m.moveZeroesLessSwapping(array);
    }
}
