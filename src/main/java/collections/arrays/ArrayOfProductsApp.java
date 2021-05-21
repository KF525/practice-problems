package collections.arrays;

public class ArrayOfProductsApp {

    /**
     * Given an array of integers arr, you’re asked to calculate for each index i the product of all integers except the integer at that index (i.e. except arr[i]). Implement a function arrayOfArrayProducts that takes an array of integers and returns an array of the products.
     * Solve without using division and analyze your solution’s time and space complexities.
     */
    public static void main(String[] args) {
        int[] arr = {8, 10, 2};
        int[] arr2 = {2, 7, 3, 4};

        ArrayOfProductsProblem a = new ArrayOfProductsProblem();
        printArr(a.arrayOfArrayProducts(arr));
        printArr(a.arrayOfArrayProducts(arr2));
    }

    private static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
