package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/4/5
 * @description CountCharacters1160
 */
public class CountCharacters1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsMap = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            charsMap.put(chars.charAt(i), charsMap.getOrDefault(chars.charAt(i), 0) + 1);
        }

        int ans = 0;
        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i), 0) + 1);
            }

            boolean flag = true;
            for (Character letter : wordMap.keySet()) {
                if (!charsMap.containsKey(letter) || wordMap.get(letter) > charsMap.get(letter)) {
                    flag = false;
                    break;
                }
            }

            ans += flag ? word.length() : 0;
        }

        return ans;
    }
}
