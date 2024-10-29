package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;

/**
 * 环形链表
 *
 * @author jackie chen
 * @date 2024/10/29 10:06 AM
 **/
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null){
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
