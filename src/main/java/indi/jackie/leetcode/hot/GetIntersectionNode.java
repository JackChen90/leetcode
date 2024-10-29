package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.ListNode;

/**
 * 相交链表
 *
 * @author jackie chen
 * @date 2024/10/23 11:29 AM
 **/
public class GetIntersectionNode {

    /**
     * 双指针法
     * 两个指针分别从两个链表头部开始遍历，当其中一个指针遍历到尾部时，将其指向另一个链表头部，继续遍历，直到两个指针相遇
     *
     * @param headA 链表A
     * @param headB 链表B
     * @return 相交节点(null表示不相交)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
