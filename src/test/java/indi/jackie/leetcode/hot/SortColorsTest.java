package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 颜色分类
 *
 * @author jackie chen
 * @date 2024/11/11 5:38 PM
 **/
public class SortColorsTest {

    @Test
    public void sortColors() {
        SortColors sortColors = new SortColors();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}