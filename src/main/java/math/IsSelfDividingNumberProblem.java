package math;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class IsSelfDividingNumberProblem {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = createNumbers(left, right + 1);
        List<Integer> selfDividingNumberList = new ArrayList();

        for (Integer n: numbers) {
            boolean include = isSelfDividing(n);
            if (include) {
                selfDividingNumberList.add(n);
            }
        }
        return selfDividingNumberList;
    }

    public List<Integer> createNumbers(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(i);
        }
        return result;
    }

    public boolean isSelfDividing(Integer n) {
        Integer selfDividingNumber = n;
        boolean isSelfDividing = true;

        while (n > 0) {
            Integer currentDigit = n%10;
            if (currentDigit == 0) {
                isSelfDividing = false;
                break;
            }
            if (!(selfDividingNumber % currentDigit == 0)) {
                isSelfDividing = false;
                break;
            }
            n = n/10;
        }
        return isSelfDividing;
    }
}
