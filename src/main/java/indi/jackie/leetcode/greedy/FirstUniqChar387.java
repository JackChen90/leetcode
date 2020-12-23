package indi.jackie.leetcode.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/12/23
 * @description FirstUniqChar387
 */
public class FirstUniqChar387 {
    public int firstUniqChar(String s) {
        if (Objects.isNull(s) || s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (char item : chars) {
            if (map.containsKey(item)) {
                map.put(item, -1);
            } else {
                map.put(item, 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
