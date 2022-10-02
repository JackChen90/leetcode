package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2022/10/3
 * @description CheckOnesSegment1784Test
 */
public class CheckOnesSegment1784Test {

    @Test
    public void checkOnesSegment() {
        CheckOnesSegment1784 checkOnesSegment1784 = new CheckOnesSegment1784();

        String param = "0";
        boolean result;

        result = checkOnesSegment1784.checkOnesSegment(param);
        Assert.assertTrue(result);

        param = "1111";
        result = checkOnesSegment1784.checkOnesSegment(param);
        Assert.assertTrue(result);

        param = "1110";
        result = checkOnesSegment1784.checkOnesSegment(param);
        Assert.assertTrue(result);

        param = "11101";
        result = checkOnesSegment1784.checkOnesSegment(param);
        Assert.assertFalse(result);

        param = "10110000";
        result = checkOnesSegment1784.checkOnesSegment(param);
        Assert.assertFalse(result);
    }
}