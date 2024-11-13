package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * @author jackie chen
 * @date 2024/10/20 11:55 PM
 **/
public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> answer = new ArrayList<>();
        int currentLeft = intervals[0][0];
        int currentRight = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1) {
                answer.add(new int[]{currentLeft, currentRight});
                break;
            }
            if (currentRight < intervals[i + 1][0]) {
                answer.add(new int[]{currentLeft, currentRight});
                currentLeft = intervals[i + 1][0];
                currentRight = intervals[i + 1][1];
            } else if (currentRight < intervals[i + 1][1]) {
                currentRight = intervals[i + 1][1];
            }
        }
        return answer.toArray(new int[0][0]);
    }
}
