package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2021/2/19
 * @description LongestOnes1004
 */
public class LongestOnes1004 {
    public int longestOnes(int[] A, int K) {
        int sum = 0;
        int lsum = 0, rsum = 0;
        int lindex = 0;
        for (int rindex = 0; rindex < A.length; rindex++) {
            rsum += 1 - A[rindex];
            while (rsum - K > lsum) {
                lsum += 1 - A[lindex++];
            }
            sum = Math.max(sum, rindex - lindex + 1);
        }
        return sum;
    }
}
