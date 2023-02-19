package indi.jackie.leetcode.struct;

import java.util.PriorityQueue;

/**
 * @author jackie chen
 * @create 2023/2/19
 * @description MaxAverageRatio1792
 */
public class MaxAverageRatio1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            //需要强转, 否则会先被int截取, 在进行默认的强转, 此时会出现截取错误
            long i = (long) (b[1] + 1) * b[1] * (a[1] - a[0]);
            long j = (long) (a[1] + 1) * a[1] * (b[1] - b[0]);
            if (i == j) {
                return 0;
            }
            return i < j ? 1 : -1;
        });
        for (int[] item : classes) {
            minHeap.offer(new int[]{item[0], item[1]});
        }
        for (int i = 0; i < extraStudents; i++) {
            int[] item = minHeap.poll();
            if (item == null) {
                break;
            }
            minHeap.offer(new int[]{item[0] + 1, item[1] + 1});
        }

        double ans = 0;
        for (int i = 0; i < classes.length; i++) {
            int[] item = minHeap.poll();
            if (item == null) {
                break;
            }
            ans += 1.0 * item[0] / item[1];
        }
        return ans / classes.length;
    }
}
