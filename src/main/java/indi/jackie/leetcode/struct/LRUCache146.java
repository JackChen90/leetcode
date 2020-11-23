package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/10/10
 * @description LRUCache146
 */
public class LRUCache146 {

    private int capacity;

    private Map<Integer, Node> data;

    private Node head;

    private Node tail;

    public LRUCache146(int capacity) {
        this.capacity = capacity;
        this.data = new HashMap<>(capacity);
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = data.get(key);
        if (Objects.isNull(node)) {
            return -1;
        } else {
            callBack(node.key, node.value);
            return node.value;
        }
    }

    public void put(int key, int value) {
        if (data.containsKey(key)) {
            callBack(key, value);
        } else {
            if (capacity == 0) {
                Node removed = deleteBeforeTail();
                data.entrySet().removeIf(e -> e.getKey().equals(removed.key));
                capacity++;
            }
            capacity--;
            Node temp = new Node(key, value);
            addAfterHead(temp);
            data.put(key, temp);
        }
    }

    private void callBack(int key, int value) {
        Node theOne = data.get(key);
        theOne.value = value;

        Node prev = theOne.prev;
        Node next = theOne.next;

        prev.next = next;
        next.prev = prev;

        addAfterHead(theOne);
    }

    private void addAfterHead(Node theOne) {
        Node tempNext = head.next;
        theOne.prev = head;
        tempNext.prev = theOne;
        head.next = theOne;
        theOne.next = tempNext;
    }

    private Node deleteBeforeTail() {
        Node removed = tail.prev;
        Node tempPrev = tail.prev.prev;
        tempPrev.next = tail;
        tail.prev = tempPrev;
        return removed;
    }

    private static class Node {
        private int key, value;

        private Node prev, next;

        private Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
