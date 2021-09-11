package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/9/11
 * @description FindIntegers600
 */
public class FindIntegers600 {

    public int findIntegers(int n) {
        int res = 0;

        //这里数学分析, 这个找结果集的过程可以用根为0的满二叉树抽象出dp公式
        int[] dp = new int[31];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= 30; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int pre = 0;
        //29由题目中的n的大小决定, 目的是从n的二进制高位找到第一个1
        for (int i = 29; i >= 0; i--) {
            int temp = 1 << i;
            if ((n & temp) != 0) {
                //这里跟抽象出的树高度有关, 左移i位, 树的高度是i+2, 其左子树高度是i+1, 把左子树的结果加进去
                res += dp[i + 1];
                if (pre == 1) {
                    //有连续1, 直接退出
                    break;
                }
                pre = 1;
            } else {
                pre = 0;
            }
            if (i == 0) {
                //走到这里说明自身没有连续1, 即抽象出的树最右的一条分支没有连续1, 加上
                res += 1;
            }
        }

        return res;
    }
}
