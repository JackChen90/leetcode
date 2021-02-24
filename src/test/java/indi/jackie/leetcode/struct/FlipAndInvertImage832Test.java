package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2021/2/24
 * @description FlipAndInvertImage832Test
 */
public class FlipAndInvertImage832Test {

    @Test
    public void flipAndInvertImage() {
        int[][] param = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = new FlipAndInvertImage832().flipAndInvertImage(param);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
