package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author jackie chen
 * @create 2020/12/9
 * @description a
 */
public class RemoveDuplicateLetters316 {
    /**
     * todo 效率问题, 需要优化
     */
    public String removeDuplicateLetters(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = initMap(array);
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < array.length) {
            if (stack.size() == 0) {
                stack.push(array[index++]);
                continue;
            }
            if (stack.contains(array[index])) {
                map.put(array[index], map.get(array[index]) - 1);
                index++;
                continue;
            }
            while (!stack.empty() && stack.peek() > array[index] && map.get(stack.peek()) > 1) {
                Character top = stack.pop();
                map.put(top, map.get(top) - 1);
            }
            stack.push(array[index++]);
        }

        String result = "";
        while (!stack.empty()) {
            result = String.valueOf(stack.pop()).concat(result);
        }
        return result;
    }

    private Map<Character, Integer> initMap(char[] array) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            if (Objects.isNull(map.get(c))) {
                map.put(c, 1);
                continue;
            }
            map.put(c, map.get(c) + 1);
        }
        return map;
    }
}
