package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/11/13
 * @description OddEventList328Test
 */
public class OddEventList328Test {

    @Test
    public void oddEvenList() {
        ListNode node = createListNode();
        ListNode head = new OddEventList328().oddEvenList(node);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    private ListNode createListNode() {
        ListNode node6 = new ListNode();
        node6.val = 7;
        node6.next = null;
        ListNode node5 = new ListNode();
        node5.val = 4;
        node5.next = node6;
        ListNode node4 = new ListNode();
        node4.val = 2;
        node4.next = node5;
        ListNode node3 = new ListNode();
        node3.val = 5;
        node3.next = node4;
        ListNode node2 = new ListNode();
        node2.val = 3;
        node2.next = node3;
        ListNode node1 = new ListNode();
        node1.val = 1;
        node1.next = node2;
        return node1;
    }
}