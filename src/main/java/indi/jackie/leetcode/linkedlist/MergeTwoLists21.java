package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

/**
 * @author jackie chen
 * @create 2023/8/5
 * @description MergeTwoLists21
 */
public class MergeTwoLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        while (null != list1 || null != list2) {
            if (null == list1 || null == list2) {
                if (null == list1) {
                    temp.next = list2;
                    list2 = list2.next;
                } else {
                    temp.next = list1;
                    list1 = list1.next;
                }
                temp = temp.next;
                continue;
            }

            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }
        return result.next;
    }
}
