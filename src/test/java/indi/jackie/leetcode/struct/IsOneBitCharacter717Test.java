package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/2/20
 * @description IsOneBitCharacter717Test
 */
public class IsOneBitCharacter717Test {

    @Test
    public void isOneBitCharacter() {
        IsOneBitCharacter717 isOneBitCharacter717 = new IsOneBitCharacter717();
        int[] param = new int[]{1, 0, 0};
        boolean result = isOneBitCharacter717.isOneBitCharacter(param);
        Assert.assertTrue(result);

        param = new int[]{1, 1, 1, 0};
        isOneBitCharacter717.isOneBitCharacter(param);
        Assert.assertTrue(result);
    }
}