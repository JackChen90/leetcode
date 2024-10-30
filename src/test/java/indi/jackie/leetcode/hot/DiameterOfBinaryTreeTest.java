package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2024/10/31
 * @description DiameterOfBinaryTreeTest
 */
public class DiameterOfBinaryTreeTest {

    @Test
    public void diameterOfBinaryTree() {
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }
}