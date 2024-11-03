package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 *
 * @author jackie chen
 * @create 2024/11/3
 * @description Generate
 */
public class Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            answer.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    answer.get(i).add(1);
                } else {
                    int item = answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j);
                    answer.get(i).add(item);
                }
            }
        }
        return answer;
    }
}
