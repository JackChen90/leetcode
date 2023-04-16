package indi.jackie.leetcode.sort;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2023/4/16
 * @description Merge88
 */
public class Merge88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
