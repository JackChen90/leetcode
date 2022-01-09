package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/1/9
 * @description SlowestKey1629Test
 */
public class SlowestKey1629Test {

    @Test
    public void slowestKey() {
        SlowestKey1629 slowestKey1629 = new SlowestKey1629();
        char result;

        int[] releaseTimes = new int[]{9, 29, 49, 50};
        String keysPressed = "cbcd";
        result = slowestKey1629.slowestKey(releaseTimes, keysPressed);
        Assert.assertEquals('c', result);

        releaseTimes = new int[]{12, 23, 36, 46, 62};
        keysPressed = "spuda";
        result = slowestKey1629.slowestKey(releaseTimes, keysPressed);
        Assert.assertEquals('a', result);
    }
}