package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2021/3/25
 * @description DeleteDuplicates82Test
 */
public class DeleteDuplicates82Test {

    @Test
    public void deleteDuplicates() {
        ListNode head = createListNode();
        ListNode result = new DeleteDuplicates82().deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private ListNode createListNode() {
        ListNode node7 = new ListNode();
        node7.val = 5;
        node7.next = null;
        ListNode node6 = new ListNode();
        node6.val = 4;
        node6.next = node7;
        ListNode node5 = new ListNode();
        node5.val = 4;
        node5.next = node6;
        ListNode node4 = new ListNode();
        node4.val = 3;
        node4.next = node5;
        ListNode node3 = new ListNode();
        node3.val = 3;
        node3.next = node4;
        ListNode node2 = new ListNode();
        node2.val = 2;
        node2.next = node3;
        ListNode node1 = new ListNode();
        node1.val = 1;
        node1.next = node2;
        return node1;
    }
}