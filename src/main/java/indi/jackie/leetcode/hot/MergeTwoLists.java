package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;

/**
 * 合并两个有序链表
 *
 * @author jackie chen
 * @date 2024/10/29 10:18 AM
 **/
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode answer = new ListNode();
        ListNode head = answer;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                head.next = list2;
                list2 = list2.next;
                head = head.next;
            } else if (list2 == null) {
                head.next = list1;
                list1 = list1.next;
                head = head.next;
            } else {
                if (list1.val > list2.val) {
                    head.next = list2;
                    list2 = list2.next;
                    head = head.next;
                } else {
                    head.next = list1;
                    list1 = list1.next;
                    head = head.next;
                }
            }
        }
        return answer.next;
    }
}
