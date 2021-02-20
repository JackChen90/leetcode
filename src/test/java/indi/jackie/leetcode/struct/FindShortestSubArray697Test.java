package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2021/2/20
 * @description FindShortestSubArray697Test
 */
public class FindShortestSubArray697Test {

    @Test
    public void findShortestSubArray() {
        int[] param = new int[]{1, 2, 2, 3, 1};
        int result = new FindShortestSubArray697().findShortestSubArray(param);
        Assert.assertEquals(2, result);
    }
}
