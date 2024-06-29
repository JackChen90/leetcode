package indi.jackie.leetcode.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindReplaceString833Test {

    @Test
    public void findReplaceString() {
        FindReplaceString833 findReplaceString833 = new FindReplaceString833();
        String result = findReplaceString833.findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"}, new String[]{"eee", "ffff"});
        assertEquals("eeebffff", result);
        result = findReplaceString833.findReplaceString("abcd", new int[]{0, 2}, new String[]{"ab", "ec"}, new String[]{"eee", "ffff"});
        assertEquals("eeecd", result);
        result = findReplaceString833.findReplaceString("abcde", new int[]{2, 2}, new String[]{"bc", "cde"}, new String[]{"f", "fe"});
        assertEquals("abfe", result);
    }
}