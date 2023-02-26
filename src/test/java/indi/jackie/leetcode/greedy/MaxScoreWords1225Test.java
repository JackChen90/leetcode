package indi.jackie.leetcode.greedy;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @author jackie chen
 * @create 2023/2/26
 * @description MaxScoreWords1225Test
 */
public class MaxScoreWords1225Test extends TestCase {

    public void testMaxScoreWords() {
        MaxScoreWords1225 maxScoreWords1225 = new MaxScoreWords1225();

        String[] words = new String[]{"dog", "cat", "dad", "good"};
        char[] letters = new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int ans = maxScoreWords1225.maxScoreWords(words, letters, score);
        Assert.assertEquals(23, ans);

        words = new String[]{"xxxz", "ax", "bx", "cx"};
        letters = new char[]{'z', 'a', 'b', 'c', 'x', 'x', 'x'};
        score = new int[]{4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};
        ans = maxScoreWords1225.maxScoreWords(words, letters, score);
        Assert.assertEquals(27, ans);

        words = new String[]{"leetcode"};
        letters = new char[]{'l', 'e', 't', 'c', 'o', 'd'};
        score = new int[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
        ans = maxScoreWords1225.maxScoreWords(words, letters, score);
        Assert.assertEquals(0, ans);

        words = new String[]{"baaa", "aacc", "ccbc", "da", "dbbc"};
        letters = new char[]{'a', 'a', 'a', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'};
        score = new int[]{9, 4, 10, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ans = maxScoreWords1225.maxScoreWords(words, letters, score);
        Assert.assertEquals(55, ans);
    }
}