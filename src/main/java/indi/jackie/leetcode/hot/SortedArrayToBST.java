package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 *
 * @author jackie chen
 * @date 2024/10/31 7:46 PM
 **/
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans = createTree(nums, 0, nums.length - 1);
        return ans;
    }

    private TreeNode createTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int index = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[index]);
        node.left = createTree(nums, left, index - 1);
        node.right = createTree(nums, index + 1, right);
        return node;
    }
}
