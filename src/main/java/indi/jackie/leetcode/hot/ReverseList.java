package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;

/**
 * 反转链表
 *
 * @author jackie chen
 * @date 2024/10/29 9:41 AM
 **/
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre;
    }
}
