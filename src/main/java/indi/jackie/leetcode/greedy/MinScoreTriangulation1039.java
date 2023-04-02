package indi.jackie.leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/4/2
 * @description MinScoreTriangulation1039
 */
public class MinScoreTriangulation1039 {

    int[] data;
    Map<Integer, Integer> map = new HashMap<>();

    public int minScoreTriangulation(int[] values) {
        this.data = values;
        return minScore(0, this.data.length - 1);
    }

    private int minScore(int i, int j) {
        if (i + 2 > j) {
            return 0;
        }

        if (i + 2 == j) {
            return this.data[i] * this.data[i + 1] * this.data[i + 2];
        }

        //通过乘以this.data.length的方式, 将原先需要存二维临时结果的key, 转成一维的key
        int key = i * this.data.length + j;
        int minScore = Integer.MAX_VALUE;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        for (int k = i + 1; k < j; k++) {
            minScore = Math.min(minScore, this.data[i] * this.data[k] * this.data[j] + minScore(i, k) + minScore(k, j));
        }
        map.put(key, minScore);

        return map.get(key);
    }
}
