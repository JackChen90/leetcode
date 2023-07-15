package indi.jackie.leetcode.greedy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/7/15
 * @description FourSum18Test
 */
public class FourSum18Test {

    @Test
    public void fourSum() {
        int[] param = new int[]{0, 0, 0, 1000000000, 1000000000, 1000000000, 1000000000};
        FourSum18 fourSum18 = new FourSum18();
        List<List<Integer>> ans = fourSum18.fourSum(param, 1000000000);
        System.out.println(ans);
    }
}