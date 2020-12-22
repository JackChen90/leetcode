package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @author jackie chen
 * @create 2020/12/22
 * @description ZigzagLevelOrder103Test
 */
public class ZigzagLevelOrder103Test {

    @Test
    public void zigzagLevelOrder() {
        TreeNode head = createTreeNode();
        List<List<Integer>> result = new ZigzagLevelOrder103().zigzagLevelOrder(head);
        result.forEach(t -> {
            t.forEach(item -> System.out.print(item + " "));
            System.out.println();
        });
    }

    private TreeNode createTreeNode() {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        return node1;
    }
}