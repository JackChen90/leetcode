package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2023/3/26
 * @description MostPoints2140
 */
public class MostPoints2140 {

    /**
     * dp公式:
     * dp[i] = max(dp[i+1], questions[i][0] + dp[i + questions[i][1] + 1])
     * <p>
     * 当i+questions[i][1]+1 > questions.length -1时，dp[i+questions[i][1]+1] = 0
     * 当i = questions.length -1时，dp[i] = questions[i][0]
     *
     * @param questions 入参param
     * @return
     */
    public long mostPoints(int[][] questions) {
        long[] dpResult = new long[questions.length];
        for (int i = 0; i < questions.length; i++) {
            dpResult[i] = -1;
        }
        return dp(0, questions, dpResult);
    }

    private long dp(int index, int[][] questions, long[] dpResult) {
        if (index > questions.length - 1) {
            return 0;
        }

        if (index == questions.length - 1) {
            return questions[index][0];
        }

        if (dpResult[index] != -1) {
            return dpResult[index];
        }

        dpResult[index] = Math.max(dp(index + 1, questions, dpResult), questions[index][0] + dp(index + questions[index][1] + 1, questions, dpResult));
        return dpResult[index];
    }
}
