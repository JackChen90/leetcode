package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/10/23
 * @description JobScheduling1235Test
 */
public class JobScheduling1235Test {

    @Test
    public void jobScheduling() {
        int[] startTime = new int[]{1, 2, 3, 3}, endTime = new int[]{3, 4, 5, 6}, profit = new int[]{50, 10, 40, 70};

        JobScheduling1235 jobScheduling1235 = new JobScheduling1235();
        int result = jobScheduling1235.jobScheduling(startTime, endTime, profit);

        Assert.assertEquals(120, result);
    }
}