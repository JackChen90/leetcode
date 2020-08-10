package indi.jackie.leetcode.linkedlist;

/**
 * @author jackie chen
 * @create 2020/8/10
 * @description ListNode
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }


    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
