package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/26
 * @description FindSubarrays2395Test
 */
public class FindSubarrays2395Test {

    @Test
    public void findSubarrays() {
        FindSubarrays2395 findSubarrays2395 = new FindSubarrays2395();

        boolean ans = findSubarrays2395.findSubarrays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Assert.assertFalse(ans);
        ans = findSubarrays2395.findSubarrays(new int[]{4, 2, 4});
        Assert.assertTrue(ans);
        ans = findSubarrays2395.findSubarrays(new int[]{0, 0, 0});
        Assert.assertTrue(ans);
    }
}