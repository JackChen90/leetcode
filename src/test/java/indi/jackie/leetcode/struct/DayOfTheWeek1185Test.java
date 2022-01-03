package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/1/3
 * @description DayOfTheWeek1185Test
 */
public class DayOfTheWeek1185Test {
    public static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Test
    public void dayOfTheWeek() {
        String result;
        DayOfTheWeek1185 dayOfTheWeek1185 = new DayOfTheWeek1185();
        result = dayOfTheWeek1185.dayOfTheWeek(1, 1, 1971);
        Assert.assertEquals(week[4], result);
        result = dayOfTheWeek1185.dayOfTheWeek(31, 8, 2019);
        Assert.assertEquals(week[5], result);
        result = dayOfTheWeek1185.dayOfTheWeek(29, 2, 2016);
        Assert.assertEquals(week[0], result);
    }
}
