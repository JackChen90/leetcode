package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/3/2
 * @description CustomSortString791
 */
public class CustomSortString791 {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();

        char[] data = s.toCharArray();

        for (char item : data) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        StringBuilder ansPrefix = new StringBuilder();
        StringBuilder ansTail = new StringBuilder();

        char[] orderData = order.toCharArray();

        for (char item : orderData) {
            if (map.containsKey(item)) {
                for (int i = 0; i < map.get(item); i++) {
                    ansPrefix.append(item);
                }
                map.remove(item);
            }
        }

        map.forEach((k, v) -> {
            for (int i = 0; i < v; i++) {
                ansTail.append(k);
            }
        });
        return ansPrefix.append(ansTail).toString();
    }
}
