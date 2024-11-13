package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

/**
 * 对称二叉树
 *
 * @author jackie chen
 * @create 2024/10/31
 * @description IsSymmetric
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        if (left.val == right.val) {
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }

        return false;
    }

}
