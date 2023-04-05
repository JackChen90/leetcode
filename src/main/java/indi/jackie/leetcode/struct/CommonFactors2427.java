package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/4/5
 * @description CommonFactors2427
 */
public class CommonFactors2427 {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int n = Math.min(a, b);
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                ans++;
            }
        }

        return ans;
    }
}
