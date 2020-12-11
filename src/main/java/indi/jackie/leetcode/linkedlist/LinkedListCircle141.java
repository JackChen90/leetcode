package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

/**
 * @author jackie chen
 * @create 2020/8/14
 * @description LinkedListCircle141
 */
public class LinkedListCircle141 {
    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null && fast != slow) {
            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
        }
        return fast != null;
    }
}
