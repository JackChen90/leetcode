package indi.jackie.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * LengthOfLongestSubstring
 *
 * @author jackie chen
 * @date 2024/10/17 1:38 PM
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int first = 0;
        int second = 0;
        int maxLength = 0;
        while (first < chars.length) {
            if (charIndexMap.containsKey(chars[first])) {
                second = Math.max(charIndexMap.get(chars[first]) + 1, second);
                charIndexMap.put(chars[first], first);
            } else {
                charIndexMap.put(chars[first], first);
            }
            maxLength = Math.max(maxLength, first - second + 1);
            first++;
        }
        return maxLength;
    }
}
