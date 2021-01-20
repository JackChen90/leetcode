package indi.jackie.leetcode.linkedlist;

import indi.jackie.leetcode.common.ListNode;
import org.junit.Test;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/10/18
 * @description MergeKList23Test
 */
public class MergeKList23Test {

    @Test
    public void mergeKLists() {
        ListNode[] lists = createNodes();
        ListNode node = new MergeKList23().mergeKLists(lists);
        while (Objects.nonNull(node)) {
            System.out.print(node.val);
            if (Objects.nonNull(node.next)) {
                System.out.print("-->");
            }
            node = node.next;
        }
    }

    private ListNode[] createNodes() {
        ListNode node1 = createNode(new int[]{1, 4, 5});
        ListNode node2 = createNode(new int[]{1, 3, 4});
        ListNode node3 = createNode(new int[]{2, 6});
//        return new ListNode[]{node1, node2, node3};
        ListNode node4 = createNode(new int[]{});
        return new ListNode[]{node4};
    }

    private ListNode createNode(int[] ints) {
        ListNode head = new ListNode();
        ListNode tail = head;
        for (int anInt : ints) {
            ListNode node = new ListNode();
            node.val = anInt;
            tail.next = node;
            tail = node;
        }
        return head.next;
    }
}