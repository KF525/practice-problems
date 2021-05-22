package collections.util;

public class Display {

    public static void printArr(int[] arr) {
        System.out.print("{");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.print("}");
    }
}
