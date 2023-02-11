package indi.jackie.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2023/2/11
 * @description FillCups2339
 */
public class FillCups2339 {
    public int fillCups(int[] amount) {
        int count = 0;
        Arrays.sort(amount);
        while (amount[2] > 0) {
            if (amount[1] == 0) {
                amount[2] -= 1;
                count++;
                continue;
            }

            amount[2] -= 1;
            amount[1] -= 1;
            count++;
            Arrays.sort(amount);
        }
        return count;
    }

    /**
     * 假设入参数组里a, b, c 3个元素有序, a<b<c.
     * 1. 若a+b<c, 则结果等于c
     * 2. 若a+b>c, 则结果等于 (a+b+c+1)/2. (加1是考虑为a+b+c和为奇数的情况)
     * reference https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/solution/zhuang-man-bei-zi-xu-yao-de-zui-duan-zon-c7y4/
     */
    public int fillCupsV2(int[] amount) {
        return Math.max(Math.max(Math.max(amount[0], amount[1]), amount[2]), (amount[0] + amount[1] + amount[2] + 1) / 2);
    }
}
