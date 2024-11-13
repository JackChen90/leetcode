package indi.jackie.leetcode.hot;

/**
 * 矩阵置零
 * 给定一个m*n的矩阵，如果一个元素是0，则将其所在行和列的所有元素都设为0
 *
 * @author jackie chen
 * @date 2024/10/22 8:55 AM
 **/
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] flag = new boolean[row * col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0 && !flag[i * col + j]) {
                    for (int l = 0; l < col; l++) {
                        if (matrix[i][l] != 0) {
                            matrix[i][l] = 0;
                            flag[i * col + l] = true;
                        }
                    }
                    for (int l = 0; l < row; l++) {
                        if (matrix[l][j] != 0) {
                            matrix[l][j] = 0;
                            flag[l * col + j] = true;
                        }
                    }
                }
            }
        }
    }
}
