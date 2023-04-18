package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/4/18
 * @description MaxAncestorDiff1026Test
 */
public class MaxAncestorDiff1026Test {

    @Test
    public void maxAncestorDiff() {
        MaxAncestorDiff1026 maxAncestorDiff1026 = new MaxAncestorDiff1026();
        TreeNode root = createTreeNode();
        int ans = maxAncestorDiff1026.maxAncestorDiff(root);
        Assert.assertEquals(2, ans);
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