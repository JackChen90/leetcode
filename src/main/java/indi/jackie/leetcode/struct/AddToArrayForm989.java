package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jackie chen
 * @create 2021/1/22
 * @description AddToArrayForm989
 */
public class AddToArrayForm989 {
    private List<Integer> result = new ArrayList<>();

    private int over = 0;

    public List<Integer> addToArrayForm(int[] A, int K) {
        calculate(A, K, 1);
        Collections.reverse(result);
        return result;
    }

    private void calculate(int[] A, int K, int index) {
        if (index > A.length && K == 0 && over == 0) {
            return;
        }
        int a = A.length >= index ? A[A.length - index] : 0;
        int k = K % 10;
        int temp = a + k + over;
        result.add(temp % 10);
        over = temp / 10;
        calculate(A, K / 10, index + 1);
    }
}
