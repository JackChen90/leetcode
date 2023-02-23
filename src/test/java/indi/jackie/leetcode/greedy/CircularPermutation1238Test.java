package indi.jackie.leetcode.greedy;

import org.junit.Test;

import java.util.List;

/**
 * @author jackie chen
 * @create 2023/2/23
 * @description CircularPermutation1238Test
 */
public class CircularPermutation1238Test {

    @Test
    public void circularPermutation() {
        CircularPermutation1238 circularPermutation1238 = new CircularPermutation1238();
        List<Integer> result = circularPermutation1238.circularPermutation(2, 3);
        System.out.println(result);
    }
}