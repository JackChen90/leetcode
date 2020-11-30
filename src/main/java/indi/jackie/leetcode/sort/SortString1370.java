package indi.jackie.leetcode.sort;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2020/11/25
 * @description SortString1370
 */
public class SortString1370 {

    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        boolean isAsc = true;
        StringBuilder result = new StringBuilder();
        char current = (char) (chars[0] - 1);
        while (count != chars.length) {
            if (isAsc) {
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == '1') {
                        continue;
                    }
                    if (chars[i] <= current) {
                        continue;
                    }
                    result.append(chars[i]);
                    current = chars[i];
                    chars[i] = '1';
                    count++;
                }
                isAsc = false;
                current = (char) (getMax(chars) + 1);
            } else {
                for (int i = chars.length - 1; i >= 0; i--) {
                    if (chars[i] == '1') {
                        continue;
                    }
                    if (chars[i] >= current) {
                        continue;
                    }
                    result.append(chars[i]);
                    current = chars[i];
                    chars[i] = '1';
                    count++;
                }
                isAsc = true;
                current = (char) (getMin(chars) - 1);
            }
        }
        return result.toString();
    }

    private char getMin(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                continue;
            }
            return chars[i];
        }
        return '0';
    }

    private char getMax(char[] chars) {
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                continue;
            }
            return chars[i];
        }
        return 'z' + 1;
    }
}
