package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/9/21
 * @description LengthOfLastWord58Test
 */
public class LengthOfLastWord58Test {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord58 lengthOfLastWord58 = new LengthOfLastWord58();
        String param;
        int result;
        param = "   fly me   to   the moon  ";
        result = lengthOfLastWord58.lengthOfLastWord(param);
        Assert.assertEquals(4, result);
        param = "luffy is still joyboy";
        result = lengthOfLastWord58.lengthOfLastWord(param);
        Assert.assertEquals(6, result);
        param = "is";
        result = lengthOfLastWord58.lengthOfLastWord(param);
        Assert.assertEquals(2, result);
    }
}