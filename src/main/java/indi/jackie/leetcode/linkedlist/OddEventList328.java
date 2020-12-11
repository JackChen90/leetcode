package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

/**
 * @author jackie chen
 * @create 2020/11/13
 * @description OddEventList328
 */
public class OddEventList328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode pre = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = pre;
        return head;
    }
}
