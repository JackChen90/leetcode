package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/5
 * @description MinOperationsMaxProfit1599
 */
public class MinOperationsMaxProfit1599 {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int profitPerOperation = boardingCost * 4 - runningCost;
        if (profitPerOperation <= 0) {
            return -1;
        }

        int maxProfit = 0;
        int maxProfitIndex = -1;
        int currentProfit = 0;
        int currentCustomer = 0;
        int currentOperation = 0;
        int currentBoarding = 0;
        while (currentCustomer > 0 || currentOperation < customers.length) {
            if (currentOperation < customers.length) {
                currentCustomer += customers[currentOperation];
            }
            currentOperation++;
            currentBoarding = Math.min(currentCustomer, 4);
            currentCustomer -= currentBoarding;
            currentProfit += currentBoarding * boardingCost - runningCost;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                maxProfitIndex = currentOperation;
            }
        }

        return maxProfitIndex;
    }
}
