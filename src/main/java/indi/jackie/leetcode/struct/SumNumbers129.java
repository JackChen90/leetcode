package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2022/11/3
 * @description SumNumbers129
 */
public class SumNumbers129 {
    public int sumNumbers(TreeNode root) {
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            return root.val;
        }
        return visit(root.left, root.val) + visit(root.right, root.val);
    }

    private int visit(TreeNode node, int num) {
        if (Objects.isNull(node)) {
            return 0;
        }
        int currentNum = num * 10 + node.val;
        if (Objects.isNull(node.left) && Objects.isNull(node.right)) {
            return currentNum;
        } else {
            return visit(node.left, currentNum) + visit(node.right, currentNum);
        }
    }

}
