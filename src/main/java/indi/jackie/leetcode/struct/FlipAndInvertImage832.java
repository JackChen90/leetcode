package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2021/2/24
 * @description FlipAndInvertImage832
 */
public class FlipAndInvertImage832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            result[i] = change(A[i]);
        }
        return result;
    }

    private int[] change(int[] params) {
        int[] line = new int[params.length];
        for (int i = 0; i < params.length; i++) {
            line[i] = 1 - params[params.length - 1 - i];
        }
        return line;
    }
}
