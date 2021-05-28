package collections.arrays;

/**
 * Approach: Three pointers- pointer for white which will be at the front of the array,
 * pointer for blue which will be at the end of the array, and then a pointer to current
 * node. While current is less than or equal to blue index. If current value is 0, swap with
 * whatever is at the white index. Then increment white index and current index. If it's blue
 * swap and decrement blue index. If current is neither blue nor white, just increment current.
 *
 * Questions: Can the array be empty? Have only 1 or 2 items in it?
 * Time complexity: O(N) where N is the size of the array.
 */
public class SortColorsProblem {

    public int[] sortColors(int[] colorArray) {
        int whiteIndex = 0;
        int blueIndex = colorArray.length - 1;
        int current = 0;

        while (current <= blueIndex) {
           if (colorArray[current] == 0) {
                swap(colorArray, current, whiteIndex);
                whiteIndex++;
                current++;
            } else if (colorArray[current] == 2) {
                swap(colorArray, current, blueIndex);
                blueIndex--;
            } else {
                current++;
            }
        }
        return colorArray;
    }

    public void swap(int[] colorArray, int i, int colorIndex) {
        int temp = colorArray[colorIndex]; // [0,1,0,2], 2, 1  temp=1
        colorArray[colorIndex] = colorArray[i];  // [0,0,0,2]
        colorArray[i] = temp; //[0,0,1,2]
    }
}