package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/10/23
 * @description MergeAlternately1768Test
 */
public class MergeAlternately1768Test {

    @Test
    public void mergeAlternately() {
        String word1 = "abc", word2 = "pqr";
        MergeAlternately1768 mergeAlternately1768 = new MergeAlternately1768();
        String result = mergeAlternately1768.mergeAlternately(word1, word2);
        Assert.assertEquals("apbqcr", result);


        word1 = "ab";
        word2 = "pqrs";
        result = mergeAlternately1768.mergeAlternately(word1, word2);
        Assert.assertEquals("apbqrs", result);
    }
}