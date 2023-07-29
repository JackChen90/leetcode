package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/7/29
 * @description DiameterOfBinaryTree543Test
 */
public class DiameterOfBinaryTree543Test {

    @Test
    public void diameterOfBinaryTree() {
        DiameterOfBinaryTree543 diameterOfBinaryTree543 = new DiameterOfBinaryTree543();
        TreeNode root = createTreeNode();
        int ans = diameterOfBinaryTree543.diameterOfBinaryTree(root);
        assertEquals(3, ans);
    }

    private TreeNode createTreeNode() {
        TreeNode root = new TreeNode(1);

        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);

        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(5);

        root.left = left1;
        root.right = right1;

        left1.left = left2;
        left1.right = right2;

        return root;
    }
}