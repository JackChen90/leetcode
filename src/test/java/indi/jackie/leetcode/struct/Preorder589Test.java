package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.Node;
import org.junit.Test;

import java.util.ArrayList;

public class Preorder589Test {

    @Test
    public void preorder() {
        Preorder589 preorder589 = new Preorder589();
        Node node = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        node.children = new ArrayList<>();
        node.children.add(node1);
        node.children.add(node2);
        node.children.add(node3);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        node1.children = new ArrayList<>();
        node1.children.add(node4);
        node1.children.add(node5);
        System.out.println(preorder589.preorder(node));
    }
}