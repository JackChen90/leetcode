package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;

import java.util.*;

/**
 * @author jackie chen
 * @create 2020/12/22
 * @description ZigzagLevelOrder103
 */
public class ZigzagLevelOrder103 {

    private boolean fromLeft = true;
    private Stack<TreeNode> stack1 = new Stack<>();
    private Stack<TreeNode> stack2 = new Stack<>();

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (Objects.isNull(root)) {
            return new ArrayList<>();
        }
        stack1.add(root);
        ergodicNode();
        return result;
    }

    private void ergodicNode() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return;
        }
        List<Integer> levelNodes = new ArrayList<>();
        if (fromLeft) {
            while (!stack1.isEmpty()) {
                TreeNode temp = stack1.pop();
                if (Objects.nonNull(temp.left)) {
                    stack2.add(temp.left);
                }
                if (Objects.nonNull(temp.right)) {
                    stack2.add(temp.right);
                }
                levelNodes.add(temp.val);
            }
            fromLeft = false;
        } else {
            while (!stack2.isEmpty()) {
                TreeNode temp = stack2.pop();
                if (Objects.nonNull(temp.right)) {
                    stack1.add(temp.right);
                }
                if (Objects.nonNull(temp.left)) {
                    stack1.add(temp.left);
                }
                levelNodes.add(temp.val);
            }
            fromLeft = true;
        }
        result.add(levelNodes);
        ergodicNode();
    }
}
