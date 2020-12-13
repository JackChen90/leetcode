package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/11/13
 * @description OddEventList328
 */
public class OddEventList328 {

    public ListNode oddEvenList(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next) || Objects.isNull(head.next.next)) {
            return head;
        }

        ListNode odd = head;
        ListNode even = odd.next;
        ListNode pre = even;
        while (Objects.nonNull(even) && Objects.nonNull(even.next)) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = pre;
        return head;
    }
}
