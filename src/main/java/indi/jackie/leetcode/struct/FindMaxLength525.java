package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2021/6/12
 * @description FindMaxLength525
 */
public class FindMaxLength525 {
    /**
     * 把1,0元素个数相等的字串转为计算前缀和(元素设置为1和-1), 经过累加前缀和再次相等时, 中间的1,0元素个数一定相等
     *
     * @param nums 入参param, 1/0数组
     * @return 1,0相等的最长字串的长度
     */
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, -1);
        int max = 0;
        int currentPrefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i] == 0 ? -1 : 1;
            if (prefixSum.containsKey(currentPrefixSum)) {
                max = Math.max(max, i - prefixSum.get(currentPrefixSum));
            } else {
                prefixSum.put(currentPrefixSum, i);
            }
        }
        return max;
    }
}
