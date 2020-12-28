package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/12/28
 * @description Candy135Test
 */
public class Candy135Test {

    @Test
    public void candy() {
        int[] param = {1, 2, 3, 1, 0};
        int result = new Candy135().candy(param);
        Assert.assertEquals(result, 9);
        param = new int[]{1, 3, 2, 2, 1};
        result = new Candy135().candy(param);
        Assert.assertEquals(result, 7);
        param = new int[]{1, 2, 2};
        result = new Candy135().candy(param);
        Assert.assertEquals(result, 4);
        param = new int[]{1, 0, 2};
        result = new Candy135().candy(param);
        Assert.assertEquals(result, 5);
    }
}