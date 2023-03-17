package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/3/17
 * @description SumRootToLeaf1022
 */
public class SumRootToLeaf1022 {
    public int sumRootToLeaf(TreeNode root) {
        List<String> data = new ArrayList<>();

        //遍历二叉树
        visitTree(root, "", data);

        int sum = 0;
        for (String item : data) {
            sum += Integer.parseUnsignedInt(item, 2);
        }

        return sum;
    }

    private void visitTree(TreeNode node, String tempS, List<String> data) {
        if (node.left == null && node.right == null) {
            data.add(tempS + node.val);
            return;
        }

        if (node.left != null) {
            visitTree(node.left, tempS + node.val, data);
        }

        if (node.right != null) {
            visitTree(node.right, tempS + node.val, data);
        }
    }
}
