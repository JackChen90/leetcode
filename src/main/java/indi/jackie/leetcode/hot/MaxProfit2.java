package indi.jackie.leetcode.hot;

/**
 * 股票卖出的最佳时机2
 * 可以多次买卖一支股票，但是必须在再次购买前卖出
 *
 * @author jackie chen
 * @create 2024/11/3
 * @description MaxProfit2
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int profit = 0;

        int buyIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                if (prices[i] > prices[buyIndex]) {
                    profit += prices[i] - prices[buyIndex];
                }
                break;
            }

            if (prices[i + 1] < prices[i]) {
                profit += prices[i] - prices[buyIndex];
                buyIndex = i + 1;
            }
        }
        return profit;
    }
}
