package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

/**
 * @author jackie chen
 * @create 2023/2/6
 * @description EvaluateTree2331
 */
public class EvaluateTree2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 0) {
            return false;
        }

        if (root.val == 1) {
            return true;
        }

        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        if (root.val == 3) {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }

        return false;
    }
}
