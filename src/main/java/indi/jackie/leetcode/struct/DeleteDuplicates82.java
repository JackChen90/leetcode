package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2021/3/25
 * @description DeleteDuplicates82
 */
public class DeleteDuplicates82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> singleList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();
        while (head != null) {
            if (duplicateList.contains(head.val)) {
                head = head.next;
                continue;
            }
            if (singleList.contains(head.val)) {
                singleList.remove(new Integer(head.val));
                duplicateList.add(head.val);
                head = head.next;
                continue;
            }
            singleList.add(head.val);
            head = head.next;
        }
        if (singleList.size() == 0) {
            return null;
        }
        ListNode newHead = new ListNode();
        newHead.val = singleList.get(0);
        ListNode temp = newHead;
        for (int i = 1; i < singleList.size(); i++) {
            ListNode tempNode = new ListNode();
            tempNode.val = singleList.get(i);
            temp.next = tempNode;
            temp = temp.next;
        }
        return newHead;
    }
}
