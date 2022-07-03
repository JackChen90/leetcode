package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/7/3
 * @description NextGreaterElement556Test
 */
public class NextGreaterElement556Test {

    @Test
    public void nextGreaterElement() {
        NextGreaterElement556 nextGreaterElement556 = new NextGreaterElement556();
        int result;
        result = nextGreaterElement556.nextGreaterElement(12);
        Assert.assertEquals(21, result);

        result = nextGreaterElement556.nextGreaterElement(3128731);
        Assert.assertEquals(3131278, result);
    }
}