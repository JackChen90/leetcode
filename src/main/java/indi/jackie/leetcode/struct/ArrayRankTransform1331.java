package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author jackie chen
 * @create 2023/3/12
 * @description ArrayRankTransform1331
 */
public class ArrayRankTransform1331 {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for (Integer item : set) {
            map.put(item, index++);
        }

        int[] ans = new int[arr.length];
        index = 0;
        for (int item : arr) {
            ans[index++] = map.get(item);
        }

        return ans;
    }
}
