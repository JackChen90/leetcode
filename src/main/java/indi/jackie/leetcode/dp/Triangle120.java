package indi.jackie.leetcode.dp;

import java.util.List;

/**
 * @author jackie chen
 * @create 2020/10/19
 * @description Triangle120
 */
public class Triangle120 {
    // 自顶向下会超时
//    public int minimumTotal(List<List<Integer>> triangle) {
//        //f[i,j] = min(f[i-1,j-1], f[i-1,j]) + triangle[i,j]
//        int size = triangle.size();
//        int result = Integer.MAX_VALUE;
//        for (int i = 0; i < size; i++) {
//            int value = calculate(triangle, size - 1, i);
//            if (value < result) {
//                result = value;
//            }
//        }
//        return result;
//    }
//
//    private int calculate(List<List<Integer>> triangle, int row, int col) {
//        if (col > row) {
//            return Integer.MAX_VALUE;
//        }
//        if (col < 0) {
//            return row < 0 ? 0 : Integer.MAX_VALUE;
//        }
//        int temp1 = calculate(triangle, row - 1, col - 1);
//        int temp2 = calculate(triangle, row - 1, col);
//        return triangle.get(row).get(col) + Math.min(temp1, temp2);
//    }

    public int minimumTotal(List<List<Integer>> triangle) {
        //f[i,j] = min(f[i-1,j-1], f[i-1,j]) + triangle[i,j]
        int size = triangle.size();
        int[] mini = new int[triangle.get(size - 1).size() + 1];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                mini[j] = triangle.get(i).get(j) + Math.min(mini[j], mini[j + 1]);
            }
        }
        return mini[0];
    }
}
