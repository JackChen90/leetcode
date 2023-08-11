package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/8/11
 * @description DiagonalSum1572
 */
public class DiagonalSum1572 {
    public int diagonalSum(int[][] mat) {
        int r = mat.length - 1;
        int l = 0;
        int ans = 0;
        for (int[] ints : mat) {
            if (l == r) {
                ans += ints[l];
            } else {
                ans += ints[l];
                ans += ints[r];
            }
            l++;
            r--;
        }
        return ans;
    }
}
