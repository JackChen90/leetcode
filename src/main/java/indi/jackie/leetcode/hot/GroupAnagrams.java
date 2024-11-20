package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字母异位词分组
 *
 * @author jackie chen
 * @create 2024/10/13
 * @description GroupAnagrams
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>(new ArrayList<>());
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        map.forEach((k, v) -> answer.add(v));
        return answer;
    }
}
