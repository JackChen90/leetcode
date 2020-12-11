package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2020/12/11
 * @description GetIntersectionNode160Test
 */
public class GetIntersectionNode160Test {

    @Test
    public void getIntersectionNode() {
        ListNode nodeA = createNode();
        ListNode nodeB = createNode();
        ListNode temp = nodeB.next.next;
        temp.next = nodeA.next.next;
        nodeA.next.next = temp;
        ListNode result = new GetIntersectionNode160().getIntersectionNode(nodeA, nodeB);
        Assert.assertNotNull(result);
    }

    private ListNode createNode() {
        ListNode head = new ListNode();
        head.val = 3;
        ListNode pre = head;
        ListNode temp;
        for (int i = 0; i < 5; i++) {
            temp = new ListNode();
            temp.val = i;
            pre.next = temp;
            pre = temp;
        }
        return head;
    }
}