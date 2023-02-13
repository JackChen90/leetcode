package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/2/13
 * @description BalancedString1234
 */
public class BalancedString1234 {

    /**
     * 核心思路
     * <p>
     * 双指针 pl和 pr, pl 和 pr之间设定为滑动窗口
     *
     * pr自动右移
     * 窗口之外的字符都满足 < s.length/4 pl向右移动
     * </p>
     *
     * @param s 入参字符串
     * @return
     */
    public int balancedString(String s) {
        Map<Character, Integer> count = new HashMap<>(4);
        count.put('Q', 0);
        count.put('W', 0);
        count.put('E', 0);
        count.put('R', 0);

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            count.put(aChar, count.get(aChar) + 1);
        }

        int m = s.length() / 4;

        if (count.get('Q') == m && count.get('W') == m && count.get('E') == m && count.get('R') == m) {
            return 0;
        }

        int ans = s.length();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            count.put(s.charAt(right), count.get(s.charAt(right)) - 1);

            while (count.get('Q') <= m && count.get('W') <= m && count.get('E') <= m && count.get('R') <= m) {
                ans = Math.min(ans, right - left + 1);
                count.put(s.charAt(left), count.get(s.charAt(left)) + 1);
                left++;
            }
        }

        return ans;
    }

}
