package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/8/6
 * @description SwapPairs24Test
 */
public class SwapPairs24Test {

    @Test
    public void swapPairs() {
        ListNode listNode = createListNode();

        SwapPairs24 swapPairs24 = new SwapPairs24();
        ListNode result = swapPairs24.swapPairs(listNode);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private ListNode createListNode() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
//        ListNode listNode2 = new ListNode(4);
//        ListNode listNode3 = new ListNode(5);

        listNode.next = listNode1;
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;

        return listNode;
    }
}