package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2023/2/6
 * @description EvaluateTree2331Test
 */
public class EvaluateTree2331Test {

    @Test
    public void evaluateTree() {
        EvaluateTree2331 evaluateTree2331 = new EvaluateTree2331();
        boolean result = evaluateTree2331.evaluateTree(createTreeNode());
        Assert.assertTrue(result);

        result = evaluateTree2331.evaluateTree(createTreeNode2());
        Assert.assertFalse(result);
    }

    private TreeNode createTreeNode2() {
        TreeNode root = new TreeNode(0);
        return root;
    }

    private TreeNode createTreeNode() {
        TreeNode root = new TreeNode(2);

        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(0);

        root.left = left1;
        root.right = right1;

        return root;
    }
}