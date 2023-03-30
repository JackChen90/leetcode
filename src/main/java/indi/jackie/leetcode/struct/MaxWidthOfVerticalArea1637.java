package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/3/30
 * @description MaxWidthOfVerticalArea1637
 */
public class MaxWidthOfVerticalArea1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = 0;
        List<Integer> data = new ArrayList<>();
        for (int[] point : points) {
            data.add(point[0]);
        }

        data.sort(Integer::compareTo);

        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) - data.get(i - 1) > ans) {
                ans = data.get(i) - data.get(i - 1);
            }
        }

        return ans;
    }
}
