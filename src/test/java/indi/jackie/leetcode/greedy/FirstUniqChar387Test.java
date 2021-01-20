package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/12/23
 * @description FirstUniqChar387Test
 */
public class FirstUniqChar387Test {

    @Test
    public void firstUniqChar() {
        int result = new FirstUniqChar387().firstUniqChar("loveleetcode");
        Assert.assertEquals(2, result);

        result = new FirstUniqChar387().firstUniqChar("leetcode");
        Assert.assertEquals(0, result);
    }
}