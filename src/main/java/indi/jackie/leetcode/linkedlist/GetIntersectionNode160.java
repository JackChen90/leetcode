package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/12/11
 * @description GetIntersectionNode160
 */
public class GetIntersectionNode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new HashMap<>();
        while (Objects.nonNull(headA)) {
            map.put(headA, 1);
            headA = headA.next;
        }
        while (Objects.nonNull(headB)) {
            if (map.containsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
