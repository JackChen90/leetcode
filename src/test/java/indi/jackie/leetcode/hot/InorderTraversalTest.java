package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2024/10/31
 * @description InorderTraversalTest
 */
public class InorderTraversalTest {

    @Test
    public void inorderTraversal() {
        InorderTraversal inorderTraversal = new InorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        assertEquals("[1, 3, 2]", inorderTraversal.inorderTraversal(root).toString());
    }
}