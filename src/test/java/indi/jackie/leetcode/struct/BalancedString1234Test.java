package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2023/2/13
 * @description BalancedString1234Test
 */
public class BalancedString1234Test {

    @Test
    public void balancedString() {
        BalancedString1234 balancedString1234 = new BalancedString1234();
        String param;
        int result;
        param = "QWER";
        result = balancedString1234.balancedString(param);
        Assert.assertEquals(0, result);

        param = "QQWE";
        result = balancedString1234.balancedString(param);
        Assert.assertEquals(1, result);

        param = "QQQW";
        result = balancedString1234.balancedString(param);
        Assert.assertEquals(2, result);

        param = "QQQQ";
        result = balancedString1234.balancedString(param);
        Assert.assertEquals(3, result);
    }
}