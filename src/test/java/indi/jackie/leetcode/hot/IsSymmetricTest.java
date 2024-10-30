package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2024/10/31
 * @description IsSymmetricTest
 */
public class IsSymmetricTest {

    @Test
    public void isSymmetric() {
        IsSymmetric isSymmetric = new IsSymmetric();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        assertFalse(isSymmetric.isSymmetric(root));
    }
}