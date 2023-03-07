package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/6
 * @description MinimumDeletions1653
 */
public class MinimumDeletions1653 {
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();

        int rightA = 0;
        for (char item : chars) {
            if (item == 'a') {
                rightA++;
            }
        }

        if (rightA == 0 || rightA == chars.length) {
            return 0;
        }

        int ans = chars.length - 1;

        int leftB = 0;
        for (int i = -1; i < chars.length; i++) {
            //从-1开始, -1表示左边没有元素, 删右侧所有的a
            if (i != -1) {
                if (chars[i] == 'a') {
                    rightA--;
                } else {
                    leftB++;
                }
            }
            ans = Math.min(ans, leftB + rightA);

        }
        return ans;
    }

}
