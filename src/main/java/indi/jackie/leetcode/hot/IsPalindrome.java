package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;

/**
 * 回文链表
 *
 * @author jackie chen
 * @date 2024/10/29 9:56 AM
 **/
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        StringBuilder nodeStr = new StringBuilder();
        StringBuilder reverseNodeStr = new StringBuilder();
        while (head != null) {
            nodeStr.append(head.val);
            reverseNodeStr.insert(0, head.val);
            head = head.next;
        }
        return nodeStr.toString().equals(reverseNodeStr.toString());
    }
}
