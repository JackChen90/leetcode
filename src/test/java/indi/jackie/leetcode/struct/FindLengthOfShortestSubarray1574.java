package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/25
 * @description FindLengthOfShortestSubarray1574
 */
public class FindLengthOfShortestSubarray1574 {
    /**
     * 1. 分别找到最长的递增子序列(从0下标往后)和最长的递减子序列(从最后一个下标往前)
     * 2. 最长递增子序列的最后一个元素大于或等于递减子序列的第一个元素, 数组已经有序, 则直接返回0
     * 3. 最长递增子序列的最后一个元素小于最长递减子序列的第一个元素，则可以删除递增子序列和递减子序列中间的元素
     * 3.1 枚举左侧元素, 找到右侧元素中第一个小于左侧元素的元素, 计算删除的元素个数
     *
     * @param arr 入参param
     * @return
     */
    public int findLengthOfShortestSubarray(int[] arr) {
        int length = arr.length;

        if (length == 1) {
            return 0;
        }

        int maxFromLeft = 0;
        int mimFromRight = length - 1;

        for (int i = 1; i < length; i++) {
            if (arr[i] >= arr[i - 1]) {
                maxFromLeft++;
            } else {
                break;
            }
        }

        for (int i = length - 2; i >= 0; i--) {
            if (arr[i] <= arr[i + 1]) {
                mimFromRight--;
            } else {
                break;
            }
        }

        if (maxFromLeft >= mimFromRight) {
            return 0;
        }

        int ans = Math.min(length - maxFromLeft - 1, mimFromRight);

        //如果递增子序列的最后一个元素小于递减子序列的第一个元素，则可以删除递增子序列和递减子序列中间的元素
        for (int i = 0; i <= maxFromLeft; i++) {
            for (int j = mimFromRight; j < length; j++) {
                if (arr[i] <= arr[j]) {
                    ans = Math.min(ans, j - i - 1);
                }
            }
        }

        return ans;
    }
}
