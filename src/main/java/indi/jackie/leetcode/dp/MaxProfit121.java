package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/1/21
 * @description MaxProfit121 https://leetcode-cn.com/circle/article/qiAgHn/
 */
public class MaxProfit121 {
    private int bestBenefit = 0;

    public int maxProfit(int[] prices) {
        if (null == prices || prices.length == 0) {
            return 0;
        }
        int[][] stock = new int[prices.length][2];
        calculate(prices, stock, 0);
        return bestBenefit;
    }

    private void calculate(int[] prices, int[][] stock, int index) {
        if (index == prices.length) {
            return;
        }
        if (index == 0) {
            stock[index][0] = prices[index];
            stock[index][1] = 0;
        } else {
            if (stock[index - 1][0] < prices[index]) {
                stock[index][0] = stock[index - 1][0];
                stock[index][1] = prices[index] - stock[index - 1][0];
            } else {
                stock[index][0] = prices[index];
                stock[index][1] = 0;
            }
        }
        if (stock[index][1] > bestBenefit) {
            bestBenefit = stock[index][1];
        }
        calculate(prices, stock, index + 1);
    }
}
