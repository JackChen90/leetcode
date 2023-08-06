package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/8/5
 * @description MergeTwoLists21Test
 */
public class MergeTwoLists21Test {

    @Test
    public void mergeTwoLists() {
        ListNode list1 = createListNode1();
        ListNode list2 = createListNode2();

        MergeTwoLists21 mergeTwoLists21 = new MergeTwoLists21();
        ListNode result = mergeTwoLists21.mergeTwoLists(list1, list2);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private ListNode createListNode2() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        return listNode;
    }

    private ListNode createListNode1() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        return listNode;
    }
}