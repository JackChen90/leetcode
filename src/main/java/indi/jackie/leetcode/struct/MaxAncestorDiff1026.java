package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

/**
 * @author jackie chen
 * @create 2023/4/18
 * @description MaxAncestorDiff1026
 */
public class MaxAncestorDiff1026 {
    private int ans = 0;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return ans;
    }

    private void dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return;
        }

        ans = Math.max(ans, Math.max(Math.abs(root.val - min), Math.abs(root.val - max)));

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        dfs(root.left, min, max);
        dfs(root.right, min, max);
    }
}
