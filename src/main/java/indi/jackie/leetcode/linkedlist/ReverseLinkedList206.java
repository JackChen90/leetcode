package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/8/10
 * @description ReverseLinkedList206
 */
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        if (Objects.isNull(head)) {
            return null;
        }
        ListNode temp = null;
        ListNode next = head.next;
        while (Objects.nonNull(head.next)) {
            head.next = temp;
            temp = head;
            head = next;
            next = next.next;
        }
        return head;
    }
}
