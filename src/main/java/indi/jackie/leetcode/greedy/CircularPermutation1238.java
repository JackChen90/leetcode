package indi.jackie.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/2/23
 * @description CircularPermutation1238
 */
public class CircularPermutation1238 {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            ans.add((i >> 1) ^ i ^ start);
        }
        return ans;
    }
}
