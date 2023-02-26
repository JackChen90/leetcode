package indi.jackie.leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/2/26
 * @description MaxScoreWords1225
 */
public class MaxScoreWords1225 {

    /**
     * 这一题的主要思路是，使用二进制的方式，将所有的组合都列出来，然后再进行判断
     * 例如：words = ["dog","cat","dad","good"]
     * 二进制的方式就是：总数 1<<4 = 16, 当前的数为 s = 0, s++实现遍历所有的组合
     * 当前词为k, s & (1 << k) != 0, 说明当前的词在组合中
     *
     * @param words   入参词组
     * @param letters 入参字母
     * @param score   入参字母对应的分数
     * @return
     */
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int ans = 0;
        Map<String, Integer> wordScoreMap = new HashMap<>(words.length);
        for (String word : words) {
            char[] chars = word.toCharArray();
            int wordScore = 0;
            for (char item : chars) {
                wordScore += score[item - 'a'];
            }
            wordScoreMap.put(word, wordScore);
        }


        for (int s = 0; s < (1 << words.length); s++) {
            Map<Character, Integer> letterCountMap = new HashMap<>(letters.length);
            for (char letter : letters) {
                letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
            }
            int wordScore = 0;
            for (int k = 0; k < words.length; k++) {
                if ((s & (1 << k)) == 0) {
                    continue;
                }
                if (afordWord(words[k], letterCountMap)) {
                    consumeWord(words[k], letterCountMap);
                    wordScore += wordScoreMap.get(words[k]);
                    ans = Math.max(ans, wordScore);
                }
            }
        }
        return ans;
    }


    private void consumeWord(String word, Map<Character, Integer> letterCountMap) {
        char[] chars = word.toCharArray();
        for (char item : chars) {
            letterCountMap.put(item, letterCountMap.get(item) - 1);
        }
    }

    private boolean afordWord(String word, Map<Character, Integer> letterCountMap) {
        char[] chars = word.toCharArray();
        Map<Character, Integer> itemMap = new HashMap<>();
        for (char item : chars) {
            if (itemMap.containsKey(item)) {
                if (itemMap.get(item) > 0) {
                    itemMap.put(item, itemMap.get(item) - 1);
                } else {
                    return false;
                }
            } else {
                if (!letterCountMap.containsKey(item)) {
                    return false;
                }
                if (letterCountMap.get(item) > 0) {
                    itemMap.put(item, letterCountMap.get(item) - 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
