package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/1/28
 * @description PivotIndex724Test
 */
public class PivotIndex724Test {

    @Test
    public void pivotIndex() {
        int[] param = new int[]{1, 7, 3, 6, 5, 6};
        int result = new PivotIndex724().pivotIndex(param);
        Assert.assertEquals(3, result);
        param = new int[]{1, 2, 3, 3, 5, 6};
        result = new PivotIndex724().pivotIndex(param);
        Assert.assertEquals(-1, result);
        param = new int[]{-1, -1, -1, 0, 1, 1};
        result = new PivotIndex724().pivotIndex(param);
        Assert.assertEquals(0, result);
        param = new int[]{2, 6, 3, -2, 9, 1};
        result = new PivotIndex724().pivotIndex(param);
        Assert.assertEquals(2, result);
    }
}