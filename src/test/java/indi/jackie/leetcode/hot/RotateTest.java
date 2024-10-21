package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 轮转数组
 *
 * @author jackie chen
 * @date 2024/10/21 9:16 AM
 **/
public class RotateTest {

    @Test
    public void rotate() {
        Rotate rotate = new Rotate();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        nums = new int[]{-1, -100, 3, 99};
        rotate.rotate(nums, 2);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}