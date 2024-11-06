package indi.jackie.leetcode.hot;

import indi.jackie.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 *
 * @author jackie chen
 * @create 2024/11/7
 * @description LevelOrder
 */
public class LevelOrder {

    /**
     * 二叉树的层序遍历
     *
     * @param root 二叉树根节点
     * @return 层序遍历结果
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        //结果
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        queue.offer(root);
        while (queue.size() > 0) {
            List<Integer> currentLevelList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentLevelList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(currentLevelList);
        }

        return result;
    }
}
