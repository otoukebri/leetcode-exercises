package org.sharpsw.leetcode;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }

        int lowestValue = prices[0];
        int lowestValueIndex = 0;

        for(int index = 1; index < prices.length; index++) {
            if(prices[index] <= lowestValue) {
                lowestValue = prices[index];
                lowestValueIndex = index;
            }
        }

        int highestProfit = 0;
        for(int index = lowestValueIndex + 1; index < prices.length; index++) {
            int profit = prices[index] - lowestValue;
            if(profit > highestProfit) {
                highestProfit = profit;
            }
        }
        return highestProfit;
    }
}
