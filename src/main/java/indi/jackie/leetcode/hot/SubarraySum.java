package indi.jackie.leetcode.hot;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 和为K的子数组
 *
 * @author jackie chen
 * @date 2024/10/20 12:57 PM
 **/
public class SubarraySum {

    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        //前缀和, 最前面都要"补一位"
        //应对当k=数组当前值的情况, 即k=num[i] 此时必有1个子串
        preSumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSumMap.containsKey(sum - k)) {
                ans += preSumMap.get(sum - k);
            }
            preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}
