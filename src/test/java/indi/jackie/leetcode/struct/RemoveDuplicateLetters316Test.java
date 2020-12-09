package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/12/9
 * @description RemoveDuplicateLetters316Test
 */
public class RemoveDuplicateLetters316Test {

    @Test
    public void removeDuplicateLetters() {
        String result = new RemoveDuplicateLetters316().removeDuplicateLetters("bbcaac");
        Assert.assertEquals("bac", result);
        result = new RemoveDuplicateLetters316().removeDuplicateLetters("cbacdcbc");
        Assert.assertEquals("acdb", result);
        result = new RemoveDuplicateLetters316().removeDuplicateLetters("bcabc");
        Assert.assertEquals("abc", result);
    }
}