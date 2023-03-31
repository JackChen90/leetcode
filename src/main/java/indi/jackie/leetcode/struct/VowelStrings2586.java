package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/3/31
 * @description VowelStrings2586
 */
public class VowelStrings2586 {
    private static final List<Character> VOWEL = new ArrayList<>();

    static {
        VOWEL.add('a');
        VOWEL.add('e');
        VOWEL.add('i');
        VOWEL.add('o');
        VOWEL.add('u');
    }

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (checkVowelString(words[i])) {
                ans++;
            }
        }
        return ans;
    }

    private boolean checkVowelString(String word) {
        return VOWEL.contains(word.charAt(0)) && VOWEL.contains(word.charAt(word.length() - 1));
    }
}
