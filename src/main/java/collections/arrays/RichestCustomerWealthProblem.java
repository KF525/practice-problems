package collections.arrays;

import java.util.Arrays;

public class RichestCustomerWealthProblem {

    /**
     * First approach:Go through the array and sum the bank accounts for each customer.
     * Update largestAccount value as I go.
     * Run Complexity: I believe this would be O((n + m) squared)
     */
    public Integer findRichestCustomer(int[][] accounts) {
        Integer largestAccount = Integer.MIN_VALUE;
        for (int i=0; i < accounts.length; i++) {
            Integer currentAccount = getAccountTotal(accounts[i]);
            if (currentAccount > largestAccount) {
                largestAccount = currentAccount;
            }
        }
        return largestAccount;
    }

    private Integer getAccountTotal(int[] amounts) {
        return Arrays.stream(amounts).sum();
    }

}
