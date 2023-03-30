package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/3/27
 * @description MinDiffInBST783
 */
public class MinDiffInBST783 {
    public int minDiffInBST(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        visitNode(root, data);

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < data.size(); i++) {
            if (Math.abs(data.get(i) - data.get(i - 1)) < ans) {
                ans = Math.abs(data.get(i) - data.get(i - 1));
            }
        }

        return ans;
    }

    private void visitNode(TreeNode root, List<Integer> data) {
        if (root == null) {
            return;
        }
        visitNode(root.left, data);
        data.add(root.val);
        visitNode(root.right, data);
    }
}
