package indi.jackie.leetcode.hot;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 数组中的第K个最大元素
 *
 * @author jackie chen
 * @create 2024/11/8
 * @description FindKthLargest
 */
public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (queue.peek() != null && queue.peek() < nums[i]) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }

        return queue.peek();
    }
}
