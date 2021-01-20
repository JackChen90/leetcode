package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/1/20
 * @description MaximumProduct628Test
 */
public class MaximumProduct628Test {

    @Test
    public void maximumProduct() {
        int[] num = {2, 3, 5, 1};
        int result = new MaximumProduct628().maximumProduct(num);
        Assert.assertEquals(30, result);

        num = new int[]{2, 0, 5, 1};
        result = new MaximumProduct628().maximumProduct(num);
        Assert.assertEquals(10, result);

        num = new int[]{2, 0, -5, 1, -1};
        result = new MaximumProduct628().maximumProduct(num);
        Assert.assertEquals(10, result);
    }
}