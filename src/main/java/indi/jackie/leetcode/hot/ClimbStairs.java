package indi.jackie.leetcode.hot;

/**
 * @author jackie chen
 * @create 2024/11/3
 * @description ClimbStairs
 */
public class ClimbStairs {

    private int[] memory;

    public int climbStairs(int n) {
        /*
        动态规划公式 f(n)= f(n-1) + f(n-2) f(1) = 1 f(2) = 2
         */
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        memory = new int[n + 1];
        memory[1] = 1;
        memory[2] = 2;

        return subClimbStairs(n - 1) + subClimbStairs(n - 2);
    }

    private int subClimbStairs(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (memory[i] != 0) {
            return memory[i];
        }
        memory[i] = subClimbStairs(i - 1) + subClimbStairs(i - 2);
        return memory[i];
    }
}
