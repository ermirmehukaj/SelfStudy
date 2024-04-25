package GroupPractice;

import java.util.Arrays;

public class BuyCheapSellExpensive {


    public static void main(String[] args) {
        int[] myArray = {7, 1, 5, 3, 6, 4};
        System.out.println(profit(myArray));
    }

    public static int profit(int[] pricesArray) {

        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 1; i < pricesArray.length; i++) {
            if (pricesArray[i] < min) {
                min = pricesArray[i];
            }
            if (pricesArray[i] - min > profit) {
                profit = pricesArray[i] - min;
            }
        }
        return profit;
    }
}
/*


To solve the "Best Time to Buy and Sell Stock" problem in Java, you can use a simple approach that iterates through the array and keeps track of the minimum price seen so far and the maximum profit achievable. Here's a verbal explanation of how you can implement this:

First, initialize two variables: minPrice to keep track of the minimum price seen so far and maxProfit to keep track of the maximum profit achievable. Set maxProfit initially to 0.
Then, iterate through the array of prices. For each price:
Check if the current price is less than minPrice. If it is, update minPrice to the current price.
Calculate the potential profit by subtracting minPrice from the current price.
Update maxProfit to be the maximum of the current maxProfit and the potential profit.
After iterating through the array, maxProfit will contain the maximum profit achievable.








Question-1 Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */