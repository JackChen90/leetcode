package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

/**
 * @author jackie chen
 * @create 2023/7/29
 * @description DiameterOfBinaryTree543
 */
public class DiameterOfBinaryTree543 {
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (null == root) {
            return 0;
        }
        depth(root);
        return ans;
    }

    private int depth(TreeNode node) {
        if (null == node) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        //注意最长路径不一定经过根节点，所以要取最大值
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }
}
