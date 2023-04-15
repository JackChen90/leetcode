package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/4/16
 * @description CanBeTypedWords1935
 */
public class CanBeTypedWords1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.contains(brokenLetters.charAt(i) + "")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }
        }
        return ans;
    }
}
