package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLUSlength522Test {

    @Test
    public void findLUSlength() {
        FindLUSlength522 findLUSlength522 = new FindLUSlength522();
        String[] data = new String[]{"a", "b", "c", "a", "b", "c"};
        int ans = findLUSlength522.findLUSlength(data);
        Assert.assertEquals(-1, ans);
    }
}