package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/3/31
 * @description ArithmeticTriplets2367
 */
public class ArithmeticTriplets2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int num : nums) {
            data.put(num, 1);
        }

        int ans = 0;

        for (int num : nums) {
            if (data.containsKey(num + diff) && data.containsKey(num + diff * 2)) {
                ans++;
            }
        }

        return ans;
    }
}
