package indi.jackie.leetcode.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2020/11/16
 * @description RemoveKdigits402Test
 */
public class RemoveKdigits402Test {

    @Test
    public void removeKdigits() {
        String result = new RemoveKdigits402().removeKdigits("1432219", 3);
        System.out.println(result);
    }
}