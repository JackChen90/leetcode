package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/1/4
 * @description Fib509Test
 */
public class Fib509Test {

    @Test
    public void fib() {
        int result = new Fib509().fib(2);
        Assert.assertEquals(1, result);
        result = new Fib509().fib(4);
        Assert.assertEquals(3, result);
    }
}