package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

/**
 * @author jackie chen
 * @create 2024/10/31
 * @description DiameterOfBinaryTree
 */
public class DiameterOfBinaryTree {

    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return ans - 1;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
