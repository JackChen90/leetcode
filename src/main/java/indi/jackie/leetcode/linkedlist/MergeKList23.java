package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jackie chen
 * @create 2020/10/17
 * @description MergeKList23
 */
public class MergeKList23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode tail = head;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        List<ListNode> listNodes = Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList());
        if (listNodes.isEmpty()){
            return null;
        }
        queue.addAll(listNodes);
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            tail.next = node;
            tail = node;
            if (Objects.nonNull(node.next)) {
                queue.add(node.next);
            }
        }
        return head.next;
    }
}
