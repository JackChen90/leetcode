package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/5
 * @description MinOperationsMaxProfit1599Test
 */
public class MinOperationsMaxProfit1599Test {

    @Test
    public void minOperationsMaxProfit() {
        MinOperationsMaxProfit1599 minOperationsMaxProfit1599 = new MinOperationsMaxProfit1599();
        int result = minOperationsMaxProfit1599.minOperationsMaxProfit(new int[]{10, 10, 6, 4, 7}, 3, 8);
        System.out.println(result);
        result = minOperationsMaxProfit1599.minOperationsMaxProfit(new int[]{3, 4, 0, 5, 1}, 1, 92);
        System.out.println(result);
        result = minOperationsMaxProfit1599.minOperationsMaxProfit(new int[]{10, 9, 6}, 6, 4);
        System.out.println(result);
    }
}