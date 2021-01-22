package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.List;

/**
 * @author jackie chen
 * @create 2021/1/22
 * @description AddToArrayForm989Test
 */
public class AddToArrayForm989Test {

    @Test
    public void addToArrayForm() {
        int[] A = new int[]{2, 7, 4};
        List<Integer> result = new AddToArrayForm989().addToArrayForm(A, 181);
        for (Integer integer : result) {
            System.out.print(integer);
        }
        System.out.println();
        A = new int[]{2, 1, 5};
        result = new AddToArrayForm989().addToArrayForm(A, 806);
        for (Integer integer : result) {
            System.out.print(integer);
        }
        System.out.println();
        A = new int[]{9, 9, 9};
        result = new AddToArrayForm989().addToArrayForm(A, 1);
        for (Integer integer : result) {
            System.out.print(integer);
        }
    }
}