package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/2/15
 * @description IsGoodArray1250
 */
public class IsGoodArray1250 {

    public boolean isGoodArray(int[] nums) {
        int commonDivisor = nums[0];
        for (int num : nums) {
            commonDivisor = gcd(commonDivisor, num);
            if (commonDivisor == 1) {
                break;
            }
        }
        return commonDivisor == 1;
    }

    /**
     * 辗转相除法求最大公约数
     *
     * @param a 入参整数a
     * @param b 入参整数b
     * @return 最大公约数
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
