package collections.arrays;

import collections.util.Display;

/**
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 *
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 */
public class DecompressRunLengthEncodedListApp {

    public static void main(String[] args) {
        DecompressRunLengthEncodedListProblem d = new DecompressRunLengthEncodedListProblem();
        int[] list = {1,2,3,4};
        Display.printArr(d.decompressRLElist(list));
    }
}
