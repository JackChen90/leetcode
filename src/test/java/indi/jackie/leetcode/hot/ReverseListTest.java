package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 反转链表
 *
 * @author jackie chen
 * @date 2024/10/29 9:54 AM
 **/
public class ReverseListTest {

    @Test
    public void reverseList() {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i < 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = reverseList.reverseList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}