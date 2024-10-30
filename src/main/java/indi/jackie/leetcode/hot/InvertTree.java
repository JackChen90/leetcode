package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

/**
 * 翻转二叉树
 *
 * @author jackie chen
 * @create 2024/10/31
 * @description InvertTree
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertNode(root);
        return root;
    }

    private void invertNode(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertNode(root.left);
        invertNode(root.right);
    }
}
