package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Preorder589 {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        preView(root, ans);
        return ans;
    }

    private void preView(Node node, List<Integer> ans) {
        if (Objects.isNull(node)) {
            return;
        }
        ans.add(node.val);
        if (Objects.isNull(node.children) || node.children.isEmpty()) {
            return;
        }
        for (Node child : node.children) {
            preView(child, ans);
        }
    }
}
