package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/4/17
 * @description CountDaysTogether2409Test
 */
public class CountDaysTogether2409Test {

    @Test
    public void countDaysTogether() {
        CountDaysTogether2409 countDaysTogether2409 = new CountDaysTogether2409();
        int ans = countDaysTogether2409.countDaysTogether("10-01", "10-31", "11-01", "12-31");
        Assert.assertEquals(0, ans);
    }
}