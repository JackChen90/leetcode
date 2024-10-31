package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 合并两个有序链表
 *
 * @author jackie chen
 * @date 2024/10/29 10:18 AM
 **/
public class MergeTwoListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode list1 = new ListNode(1);
        ListNode current = list1;
        for (int i = 2; i < 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode list2 = new ListNode(1);
        current = list2;
        for (int i = 2; i < 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode result = mergeTwoLists.mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}