package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2021/9/11
 * @description FindIntegers600Test
 */
public class FindIntegers600Test {

    @Test
    public void findIntegers() {
        FindIntegers600 findIntegers600 = new FindIntegers600();
        int result;
        result = findIntegers600.findIntegers(6);
        Assert.assertEquals(3, result);
        result = findIntegers600.findIntegers(5);
        Assert.assertEquals(5, result);
        result = findIntegers600.findIntegers(1);
        Assert.assertEquals(2, result);
    }
}