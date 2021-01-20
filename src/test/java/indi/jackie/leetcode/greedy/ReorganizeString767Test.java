package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/11/30
 * @description ReorganizeString767Test
 */
public class ReorganizeString767Test {

    @Test
    public void reorganizeString() {
        String param = "bbbbbbb";
        String result = new ReorganizeString767().reorganizeString(param);
        Assert.assertEquals("", result);
        param = "vvvole";
        result = new ReorganizeString767().reorganizeString(param);
        Assert.assertEquals(6, result.length());
    }
}