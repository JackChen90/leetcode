package indi.jackie.leetcode.struct;

import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/8/5
 * @description FindSpecialInteger1287
 */
public class FindSpecialInteger1287 {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        if (length < 3) {
            return arr[0];
        }

        Map<Integer, Integer> map = new java.util.HashMap<>();
        int threshold = length / 4 + 1;

        for (int item : arr) {
            int temp = map.getOrDefault(item, 0) + 1;
            if (temp >= threshold) {
                return item;
            }
            map.put(item, temp);
        }

        return -1;
    }
}
