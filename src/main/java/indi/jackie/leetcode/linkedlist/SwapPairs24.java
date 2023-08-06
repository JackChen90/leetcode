package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

/**
 * @author jackie chen
 * @create 2023/8/6
 * @description SwapPairs24
 */
public class SwapPairs24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;

        ListNode l = head;
        ListNode p = head.next;

        ListNode tempL;
        ListNode tempP;
        while (true) {
            tempL = l.next.next;
            if (tempL == null) {
                p.next = l;
                l.next = null;
                break;
            }
            tempP = p.next.next;
            p.next = l;
            l = tempL;
            if (tempP == null) {
                p.next.next = tempL;
                break;
            } else {
                p.next.next = tempP;
                p = tempP;
            }
        }
        return newHead;
    }
}
