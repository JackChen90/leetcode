package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2023/8/18
 * @description MinIncrementForUnique945
 */
public class MinIncrementForUnique945 {
    public int minIncrementForUnique(int[] nums) {
        int ans = 0;
        int token = 0;
        //题中限制范围10万, 为了兼容10万个重复的数的情况, 数组长度要翻倍, 否则不够用
        int[] dataCount = new int[200001];

        for (int num : nums) {
            dataCount[num]++;
        }

        //采用先减后加的方式
        for (int i = 0; i < dataCount.length; i++) {
            if (dataCount[i] > 1) {
                ans -= i * (dataCount[i] - 1);
                token += dataCount[i] - 1;
            } else if (dataCount[i] == 0 && token > 0) {
                ans += i;
                token--;
            }
        }

        return ans;
    }
}
