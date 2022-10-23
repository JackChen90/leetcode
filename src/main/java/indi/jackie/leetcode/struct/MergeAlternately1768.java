package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/10/23
 * @description MergeAlternately1768
 */
public class MergeAlternately1768 {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        boolean appendWord2 = word2.length() > word1.length();
        for (int i = 0; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }

        if (appendWord2) {
            sb.append(word2, word1.length(), word2.length() );
        }
        return sb.toString();
    }
}
