package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2021/2/25
 * @description Transpose867Test
 */
public class Transpose867Test {

    @Test
    public void transpose() {
        int[][] param = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] result = new Transpose867().transpose(param);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
