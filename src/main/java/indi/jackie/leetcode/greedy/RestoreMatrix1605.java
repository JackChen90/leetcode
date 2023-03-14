package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2023/3/14
 * @description RestoreMatrix1605
 */
public class RestoreMatrix1605 {

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][]ans = new int[rowSum.length][colSum.length];

        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                ans[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= ans[i][j];
                colSum[j] -= ans[i][j];
            }
        }
        return ans;
    }
}
