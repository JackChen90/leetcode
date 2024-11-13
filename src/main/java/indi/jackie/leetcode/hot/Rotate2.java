package indi.jackie.leetcode.hot;

/**
 * 旋转图像
 * 给定一个n*n的二维矩阵表示一个图像，将图像顺时针旋转90度
 *
 * @author jackie chen
 * @create 2024/11/6
 * @description Rotate2
 */
public class Rotate2 {
    /**
     * 水平翻转，然后对角线翻转
     *
     * @param matrix 矩阵
     */
    public void rotate(int[][] matrix) {
        int length = matrix.length;

        //水平翻转
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length - i - 1][j];
                matrix[length - i - 1][j] = temp;
            }
        }

        //对角线翻转
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
