package indi.jackie.leetcode.slf;

import java.util.Scanner;

/**
 * @author jackie chen
 * @create 2020/10/18
 * @description HuaWeiTest2
 */
public class HuaWeiTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        char[] chars = data.toCharArray();

        doChange(chars, 0);
        System.out.println(new String(chars));
    }

    private static void doChange(char[] chars, int i) {
        if (i == chars.length - 1) {
            return;
        }
        char min = chars[chars.length - 1];
        int minIndex = chars.length - 1;
        for (int k = chars.length - 2; k > i; k--) {
            if (min > chars[k]) {
                min = chars[k];
                minIndex = k;
            }
        }
        if (min < chars[i]) {
            chars[minIndex] = chars[i];
            chars[i] = min;
            return;
        }
        doChange(chars, i + 1);
    }
}
