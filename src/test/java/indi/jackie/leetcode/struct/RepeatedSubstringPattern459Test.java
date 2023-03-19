package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/19
 * @description RepeatedSubstringPattern459Test
 */
public class RepeatedSubstringPattern459Test {

    @Test
    public void repeatedSubstringPattern() {
        RepeatedSubstringPattern459 repeatedSubstringPattern459 = new RepeatedSubstringPattern459();
        assertTrue(repeatedSubstringPattern459.repeatedSubstringPattern("abab"));
        assertFalse(repeatedSubstringPattern459.repeatedSubstringPattern("aba"));
        assertTrue(repeatedSubstringPattern459.repeatedSubstringPattern("abcabcabcabc"));
    }
}