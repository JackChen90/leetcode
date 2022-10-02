package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2022/10/3
 * @description CanTransform777Test
 */
public class CanTransform777Test {

    @Test
    public void canTransform() {
        CanTransform777 canTransform777 =  new CanTransform777();
        String start = "RXXLRXRXL";
        String end = "XRLXXRRLX";
        Boolean result;
        result = canTransform777.canTransform(start, end);
        Assert.assertTrue(result);
    }
}