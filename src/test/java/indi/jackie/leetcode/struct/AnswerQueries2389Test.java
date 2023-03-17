package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2023/3/17
 * @description AnswerQueries2389Test
 */
public class AnswerQueries2389Test {

    @Test
    public void answerQueries() {
        AnswerQueries2389 answerQueries2389 = new AnswerQueries2389();
        int[] result = answerQueries2389.answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21});
        System.out.println(Arrays.toString(result));
        result = answerQueries2389.answerQueries(new int[]{2, 3, 4, 5}, new int[]{1});
        System.out.println(Arrays.toString(result));
    }
}