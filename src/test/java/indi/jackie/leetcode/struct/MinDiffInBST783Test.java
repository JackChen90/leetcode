package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/27
 * @description MinDiffInBST783Test
 */
public class MinDiffInBST783Test {

    @Test
    public void minDiffInBST() {
        MinDiffInBST783 minDiffInBST783 = new MinDiffInBST783();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        assertEquals(1, minDiffInBST783.minDiffInBST(root));
    }
}