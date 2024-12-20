package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

/**
 * 二叉树的最大深度
 * 二叉树的最大深度是从根节点到最远叶子节点的最长路径上的节点数量
 *
 * @author jackie chen
 * @create 2024/10/31
 * @description MaxDepth
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        return Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1));
    }
}
