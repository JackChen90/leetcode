package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

import java.util.List;

/**
 * 中序遍历
 *
 * @author jackie chen
 * @create 2024/10/31
 * @description InorderTraversal
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new java.util.ArrayList<>();
        inorderTraversal(root, answer);
        return answer;
    }

    private void inorderTraversal(TreeNode node, List<Integer> answer) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, answer);
        answer.add(node.val);
        inorderTraversal(node.right, answer);
    }
}
