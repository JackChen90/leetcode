package indi.jackie.leetcode.greedy;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @author jackie chen
 * @create 2023/2/27
 * @description MovesToMakeZigzag1144Test
 */
public class MovesToMakeZigzag1144Test extends TestCase {

    public void testMovesToMakeZigzag() {
        int[] param = new int[]{9, 6, 1, 6, 2};
        MovesToMakeZigzag1144 movesToMakeZigzag1144 = new MovesToMakeZigzag1144();
        int ans = movesToMakeZigzag1144.movesToMakeZigzag(param);
        Assert.assertEquals(4, ans);
    }
}