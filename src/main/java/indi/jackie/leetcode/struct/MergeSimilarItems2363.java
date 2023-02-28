package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author jackie chen
 * @create 2023/2/28
 * @description MergeSimilarItems2363
 */
public class MergeSimilarItems2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] item : items1) {
            if (map.containsKey(item[0])){
                map.put(item[0], map.get(item[0]) + item[1]);
            } else {
                map.put(item[0], item[1]);
            }
        }
        for (int[] item : items2) {
            if (map.containsKey(item[0])){
                map.put(item[0], map.get(item[0]) + item[1]);
            } else {
                map.put(item[0], item[1]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            ans.add(list);
        }

        return ans;
    }
}
