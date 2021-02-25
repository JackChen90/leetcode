package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2021/2/25
 * @description Transpose867
 */
public class Transpose867 {
    public int[][] transpose(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        int [][] result = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
