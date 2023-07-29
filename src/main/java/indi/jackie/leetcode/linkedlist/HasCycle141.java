package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

/**
 * @author jackie chen
 * @create 2023/7/29
 * @description HasCycle141
 */
public class HasCycle141 {
    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (null != fast && null != fast.next) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
