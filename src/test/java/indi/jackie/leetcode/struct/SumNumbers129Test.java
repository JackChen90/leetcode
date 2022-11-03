package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/11/3
 * @description SumNumbers129Test
 */
public class SumNumbers129Test {

    @Test
    public void sumNumbers() {
        SumNumbers129 sumNumbers129 = new SumNumbers129();

        TreeNode treeNode = createTreeNode();

        int result = sumNumbers129.sumNumbers(treeNode);

        Assert.assertEquals(25, result);
    }

    private TreeNode createTreeNode() {
        TreeNode root = new TreeNode(1);

        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);

        root.left = left1;
        root.right = right1;

        return root;

    }
}