package indi.jackie.leetcode.struct;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2023/3/17
 * @description AnswerQueries2389
 */
public class AnswerQueries2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];

        int[] sortNums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];

            int count = 0;
            int sum = 0;
            for (int j = 0; j < sortNums.length; j++) {
                sum += sortNums[j];
                if (sum > query) {
                    ans[i] = count;
                    break;
                }
                count++;
                if (j == sortNums.length - 1) {
                    ans[i] = count;
                }
            }
        }

        return ans;
    }
}
