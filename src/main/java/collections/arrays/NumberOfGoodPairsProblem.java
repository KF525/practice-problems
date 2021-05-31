package collections.arrays;

public class NumberOfGoodPairsProblem {
    public Integer numberOfGoodPairs(int[] nums) {
        Integer count = 0;
        int j = 0;
        int i = 1;

        while (j < nums.length - 1) {
            if (i == nums.length) {
                j++;
                i = j + 1; //set i to one more than current j
            } else if (i != j && nums[j] == nums[i]) {
                count++;
                i++;
            } else {
                i++;
            }
        }
        return count;
    } 
}
