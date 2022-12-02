package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/12/2
 * @description MinOperations1769
 */
public class MinOperations1769 {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    result[i] += Math.abs(j - i);
                }
            }
        }

        return result;
    }
}
