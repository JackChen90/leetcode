package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/8/10
 * @description ReverseString344
 */
public class ReverseString344 {
    public void reverseString(char[] s) {
        int length = s.length;
        if (length < 2) {
            return;
        }

        int left = 0;
        int right = length - 1;

        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}
