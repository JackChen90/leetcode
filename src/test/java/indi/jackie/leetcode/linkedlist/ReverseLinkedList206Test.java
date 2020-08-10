package indi.jackie.leetcode.linkedlist;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/8/10
 * @description ReverseLinkedList206Test
 */
public class ReverseLinkedList206Test {

    private ListNode head = null;

    @Before
    public void init() {
        ListNode temp;
        for (int i = 0; i < 5; i++) {
            if (Objects.isNull(head)) {
                head = new ListNode(i);
                continue;
            }
            temp = new ListNode(i);
            temp.next = head;
            head = temp;
        }
    }

    @Test
    public void reverseList() {
        ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();
        printLinkedList(head);
        ListNode newHead = reverseLinkedList206.reverseList(head);
        printLinkedList(newHead);
    }

    private void printLinkedList(ListNode head) {
        while (Objects.nonNull(head)) {
            System.out.print(head.val);
            if (Objects.nonNull(head.next)) {
                System.out.print("-->");
            }
            head = head.next;
        }
        System.out.println();
    }
}
