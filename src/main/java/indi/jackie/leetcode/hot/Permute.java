package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 全排列
 * 给定一个不含重复数字的数组nums，返回其所有可能的全排列
 *
 * @author jackie chen
 * @date 2024/11/7 3:38 PM
 **/
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> param = new ArrayList<>();
        for (int num : nums) {
            param.add(num);
        }
        permute(result, param, 0);
        return result;
    }

    private void permute(List<List<Integer>> result, List<Integer> param, int first) {
        if (first == param.size()) {
            result.add(new ArrayList<>(param));
        }
        for (int i = first; i < param.size(); i++) {
            Collections.swap(param, first, i );
            permute(result, param, first + 1);
            Collections.swap(param, first, i );
        }
    }
}
