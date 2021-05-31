package collections.arrays;

/**
 * Problem: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth. https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealthApp {

    public static void main(String[] args) {
        RichestCustomerWealthProblem r = new RichestCustomerWealthProblem();
        int[][] accounts1 = {{1,2,3}, {3,2,1}};
        int[][] accounts2 = {{1,5}, {7,3}, {3,5}};
        System.out.println(r.findRichestCustomer(accounts1));
        System.out.print(r.findRichestCustomer(accounts2));
    }
}
