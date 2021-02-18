package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/2/18
 * @description MaxProfit122
 */
public class MaxProfit122 {

    private int NotBuy = -999;

    public int maxProfit(int[] prices) {
        if (null == prices || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int[][] stock = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            stock[i][0] = NotBuy;
        }
        calculate(prices, stock, 0);
        int result = 0;
        for (int i = 0; i < stock.length; i++) {
            result += stock[i][1];
        }
        return result;
    }

    private void calculate(int[] prices, int[][] stock, int i) {
        if (i == prices.length) {
            return;
        }
        if (i == 0) {
            if (prices[i] < prices[i + 1]) {
                stock[i][0] = prices[i];
            }
        } else if (i == prices.length - 1) {
            if (stock[i - 1][0] != NotBuy && prices[i] > stock[i - 1][0]) {
                stock[i][1] = prices[i] - stock[i - 1][0];
            }
        } else {
            if (prices[i] < prices[i + 1]) {
                if (stock[i - 1][0] != NotBuy) {
                    stock[i][0] = prices[i] > stock[i - 1][0] ? stock[i - 1][0] : prices[i];
                } else {
                    stock[i][0] = prices[i];
                }
            } else {
                if (stock[i - 1][0] != NotBuy) {
                    stock[i][1] = prices[i] - stock[i - 1][0];
                }
            }
        }
        calculate(prices, stock, i + 1);
    }
}
