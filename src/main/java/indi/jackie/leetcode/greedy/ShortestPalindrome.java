package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2020/10/20
 * @description ShortestPalindrome
 */
public class ShortestPalindrome {
    private int symmetrical = 0;

    private int palindromeIndex = 0;

    private int length = 0;

    public String shortestPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        checkStr(str);
        if (palindromeIndex > (str.length() / 2 - 1)) {
            return str + new StringBuilder(str.substring(0, palindromeIndex - length + symmetrical)).reverse();
        } else {
            return new StringBuilder(str.substring(palindromeIndex + length + 1)).reverse() + str;
        }
    }

    private void checkStr(String str) {
        doCheck(str.toCharArray(), 0, 0);
        doCheck(str.toCharArray(), 0, 1);
    }

    private void doCheck(char[] chars, int index, int symmetrical) {
        if (index > chars.length) {
            return;
        }
        int count = 1;
        while (true) {
            if (index + symmetrical - count < 0 || index + count > chars.length - 1) {
                break;
            }
            if (chars[index + symmetrical - count] == chars[index + count]) {
                if (count > this.length) {
                    this.palindromeIndex = index;
                    this.length = count;
                    this.symmetrical = symmetrical;
                }
                count++;
                continue;
            }
            break;
        }
        doCheck(chars, index + 1, symmetrical);
    }
}
