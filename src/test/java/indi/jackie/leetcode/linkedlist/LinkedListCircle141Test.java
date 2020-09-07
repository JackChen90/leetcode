package indi.jackie.leetcode.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;
import java.util.Random;

/**
 * @author jackie chen
 * @create 2020/8/14
 * @description LinkedListCircle141Test
 */
public class LinkedListCircle141Test {
    private ListNode head = null;
    private boolean hasCircle = false;

    @Before
    public void init() {
        ListNode temp = null;
        ListNode tail = null;
        for (int i = 0; i < 5; i++) {
            if (Objects.isNull(head)) {
                head = new ListNode(i);
                tail = head;
                continue;
            }
            temp = new ListNode(i);
            temp.next = head;
            head = temp;
        }

        if (new Random().nextBoolean()) {
            for (int i = 0; i < new Random().nextInt(3); i++) {
                temp = temp.next;
            }
            tail.next = temp;
            hasCircle = true;
        }
    }

    @Test
    public void hasCycle() {
        boolean hasCircle = new LinkedListCircle141().hasCycle(head);
        Assert.assertEquals(this.hasCircle, hasCircle);
    }
}