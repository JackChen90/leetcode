package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 螺旋矩阵
 *
 * @author jackie chen
 * @date 2024/10/23 11:25 AM
 **/
public class SpiralOrderTest {

    @Test
    public void spiralOrder() {
        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder.spiralOrder(matrix));
        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(spiralOrder.spiralOrder(matrix));
    }
}