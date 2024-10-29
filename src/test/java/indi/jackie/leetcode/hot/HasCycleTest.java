package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 环形链表
 *
 * @author jackie chen
 * @date 2024/10/29 10:10 AM
 **/
public class HasCycleTest {

    @Test
    public void hasCycle() {
        HasCycle hasCycle = new HasCycle();
        ListNode head = new ListNode(1);
        ListNode current = head;
        ListNode cycle = null;
        for (int i = 2; i < 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
            if (i == 3) {
                cycle = current;
            }
        }
        current.next = cycle;
        System.out.println(hasCycle.hasCycle(head));
    }
}