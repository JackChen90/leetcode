package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/2/16
 * @description NumberOfPairs2341
 */
public class NumberOfPairs2341 {

    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int ans1 = 0;
        int ans2 = 0;
        for (Integer key : map.keySet()) {
            ans1 += map.get(key) / 2;
            ans2 += map.get(key) % 2;
        }

        return new int[]{ans1, ans2};
    }
}
