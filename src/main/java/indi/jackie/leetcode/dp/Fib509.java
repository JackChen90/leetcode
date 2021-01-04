package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/1/4
 * @description Fib509
 */
public class Fib509 {
    public int fib(int n) {
        return doFib(n);
    }

    private int doFib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return doFib(n - 1) + doFib(n - 2);
    }
}
