package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/1/27
 * @description NumEquivDominoPairs1128Test
 */
public class NumEquivDominoPairs1128Test {

    @Test
    public void numEquivDominoPairs() {
        int[][] param = new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int result = new NumEquivDominoPairs1128().numEquivDominoPairs(param);
        Assert.assertEquals(1, result);
        param = new int[][]{{1, 2}, {2, 1}, {1, 2}, {5, 6}};
        result = new NumEquivDominoPairs1128().numEquivDominoPairs(param);
        Assert.assertEquals(3, result);
    }
}