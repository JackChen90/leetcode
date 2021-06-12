package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/6/13
 * @description FindMaxLength525Test
 */
public class FindMaxLength525Test {

    @Test
    public void findMaxLength() {
        FindMaxLength525 findMaxLength525 = new FindMaxLength525();
        int[] param = new int[]{0, 1};
        int result = findMaxLength525.findMaxLength(param);
        Assert.assertEquals(2, result);
        param = new int[]{0, 1, 0, 0, 1, 1};
        result = findMaxLength525.findMaxLength(param);
        Assert.assertEquals(6, result);
    }
}