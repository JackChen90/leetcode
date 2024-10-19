package indi.jackie.leetcode.hot;

/**
 * 最大区域
 *
 * @author jackie chen
 * @date 2024/10/16 4:19 PM
 **/
public class MaxArea {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int maxArea = 0;
        int currentArea = 0;
        while (i < j) {
            currentArea = Math.min(height[i], height[j]) * (j - i);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
