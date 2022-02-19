package indi.jackie.leetcode.sort;

import org.junit.Test;

import java.util.List;

/**
 * @author jackie chen
 * @create 2022/2/19
 * @description PancakeSort969Test
 */
public class PancakeSort969Test {

    @Test
    public void pancakeSort() {
        PancakeSort969 pancakeSort969 = new PancakeSort969();

        int[] param = new int[]{3, 2, 4, 1};
        List<Integer> result = pancakeSort969.pancakeSort(param);

        System.out.println(result);

    }
}