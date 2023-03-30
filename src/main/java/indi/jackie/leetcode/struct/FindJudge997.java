package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/3/30
 * @description FindJudge997
 */
public class FindJudge997 {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) {
            return 1;
        }

        Map<Integer, Integer> beTrusted = new HashMap<>();
        Map<Integer, Integer> trusted = new HashMap<>();

        int ans = -1;
        for (int[] item : trust) {
            trusted.put(item[0], beTrusted.getOrDefault(item[0], 0) + 1);
            beTrusted.put(item[1], beTrusted.getOrDefault(item[1], 0) + 1);
        }

        for (Integer beTrustedItem : beTrusted.keySet()) {
            if (beTrusted.get(beTrustedItem) == n - 1 && !trusted.containsKey(beTrustedItem)) {
                ans = beTrustedItem;
            }
        }

        return ans;
    }
}
