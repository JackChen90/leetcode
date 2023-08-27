package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/8/27
 * @description Merge56
 */
public class Merge56 {
    private static final int MaxThreshold = 10001;

    public int[][] merge(int[][] intervals) {

        int[] left = new int[MaxThreshold];
        int[] right = new int[MaxThreshold];

        for (int[] interval : intervals) {
            left[interval[0]]++;
            right[interval[1]]++;
        }

        List<int[]> ansList = new ArrayList<>();

        int start = -1;
        int leftCount = 0;
        for (int i = 0; i < MaxThreshold; i++) {
            if (left[i] > 0) {
                if (start == -1) {
                    start = i;
                }
                leftCount += left[i];
            }
            if (right[i] > 0) {
                leftCount -= right[i];
                if (leftCount == 0) {
                    ansList.add(new int[]{start, i});
                    start = -1;
                }
            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }

}
