package indi.jackie.leetcode.dp;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2020/12/7
 * @description MaxNumber321Test
 */
public class MaxNumber321Test {

    @Test
    public void maxNumber() {
        int[] nums1 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] nums2 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] result = new MaxNumber321().maxNumber(nums1, nums2, 100);
        System.out.println(Arrays.toString(result));
        nums1 = new int[]{6, 5, 4, 6, 3, 7, 5, 6, 4, 5, 6, 4};
        nums2 = new int[]{8, 8, 6, 0};
        result = new MaxNumber321().maxNumber(nums1, nums2, 16);
        System.out.println(Arrays.toString(result));
        nums1 = new int[]{3, 4, 6, 5};
        nums2 = new int[]{9, 1, 2, 5, 8, 3};
        result = new MaxNumber321().maxNumber(nums1, nums2, 5);
        System.out.println(Arrays.toString(result));
        nums1 = new int[]{6, 7};
        nums2 = new int[]{6, 0, 4};
        result = new MaxNumber321().maxNumber(nums1, nums2, 3);
        System.out.println(Arrays.toString(result));
        nums1 = new int[]{3, 9};
        nums2 = new int[]{8, 9};
        result = new MaxNumber321().maxNumber(nums1, nums2, 3);
        System.out.println(Arrays.toString(result));
        nums1 = new int[]{3, 2};
        nums2 = new int[]{};
        result = new MaxNumber321().maxNumber(nums1, nums2, 2);
        System.out.println(Arrays.toString(result));
    }
}