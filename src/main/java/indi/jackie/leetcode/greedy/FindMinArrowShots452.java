package indi.jackie.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2020/11/24
 * @description FindMinArrowShots452
 */
public class FindMinArrowShots452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                if (o1[0] == o2[0]) {
                    return 0;
                }
                return o1[0] > o2[0] ? 1 : -1;
            }
            return o1[1] > o2[1] ? 1 : -1;
        });
        int rightPoint = points[0][1];
        int result = 1;
        for (int[] point : points) {
            if (point[0] <= rightPoint) {
                continue;
            }
            rightPoint = point[1];
            result++;
        }
        return result;
    }
}
