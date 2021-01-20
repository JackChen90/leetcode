package indi.jackie.leetcode.struct;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author jackie chen
 * @create 2021/1/20
 * @description MaximumProduct628
 */
public class MaximumProduct628 {
    public int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            if (minHeap.size() < 3 && maxHeap.size() < 2) {
                minHeap.add(num);
                maxHeap.add(num);
                continue;
            }
            if (maxHeap.peek() > num) {
                maxHeap.poll();
                maxHeap.add(num);
            }
            if (minHeap.size() < 3) {
                minHeap.add(num);
                continue;
            }
            if (minHeap.peek() < num) {
                minHeap.poll();
                minHeap.add(num);
            }
        }
        int[] maxArray = new int[2];
        int[] minArray = new int[3];
        for (int i = 0; i < 2; i++) {
            maxArray[i] = maxHeap.poll();
        }
        for (int i = 0; i < 3; i++) {
            minArray[i] = minHeap.poll();
        }
        return Math.max(minArray[0] * minArray[1] * minArray[2], minArray[2] * maxArray[0] * maxArray[1]);
    }
}
