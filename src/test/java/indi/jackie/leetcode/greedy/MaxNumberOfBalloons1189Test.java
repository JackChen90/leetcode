package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/2/13
 * @description MaxNumberOfBalloons1189Test
 */
public class MaxNumberOfBalloons1189Test {

    @Test
    public void maxNumberOfBalloons() {
        String text = "nlaebolko";
        MaxNumberOfBalloons1189 maxNumberOfBalloons1189 = new MaxNumberOfBalloons1189();
        int result = maxNumberOfBalloons1189.maxNumberOfBalloons(text);
        Assert.assertEquals(1, result);

        text = "loonbalxballpoon";
        result = maxNumberOfBalloons1189.maxNumberOfBalloons(text);
        Assert.assertEquals(2, result);

        text = "leetcode";
        result = maxNumberOfBalloons1189.maxNumberOfBalloons(text);
        Assert.assertEquals(0, result);

        text = "balon";
        result = maxNumberOfBalloons1189.maxNumberOfBalloons(text);
        Assert.assertEquals(0, result);
    }
}