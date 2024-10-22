package indi.jackie.leetcode.hot;

import org.junit.Test;

/**
 * 矩阵置零
 *
 * @author jackie chen
 * @date 2024/10/22 9:02 AM
 **/
public class SetZeroesTest {

    @Test
    public void setZeroes() {
        SetZeroes setZeroes = new SetZeroes();
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes.setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes.setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}