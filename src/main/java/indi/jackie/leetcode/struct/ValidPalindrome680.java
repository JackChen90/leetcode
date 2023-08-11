package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/8/6
 * @description ValidPalindrome680
 */
public class ValidPalindrome680 {
    public boolean validPalindrome(String s) {
        boolean ans = true;

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
                continue;
            }
            if (s.substring(left + 1, right + 1).equals(new StringBuilder(s.substring(left + 1, right + 1)).reverse().toString())) {
                break;
            }
            if (s.substring(left, right).equals(new StringBuilder(s.substring(left, right)).reverse().toString())) {
                break;
            }
            ans = false;
            break;
        }

        return ans;
    }
}
