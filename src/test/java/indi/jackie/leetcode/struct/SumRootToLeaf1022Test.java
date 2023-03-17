package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/17
 * @description SumRootToLeaf1022Test
 */
public class SumRootToLeaf1022Test {

    @Test
    public void sumRootToLeaf() {
        TreeNode node = createTreeNode();
        SumRootToLeaf1022 sumRootToLeaf1022 = new SumRootToLeaf1022();
        int ans = sumRootToLeaf1022.sumRootToLeaf(node);
        Assert.assertEquals(15, ans);
    }

    private TreeNode createTreeNode() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(0);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        return node1;
    }
}