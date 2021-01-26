package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/1/26
 * @description RegionsBySlashes959Test
 */
public class RegionsBySlashes959Test {

    @Test
    public void regionsBySlashes() {
        String[] grid = new String[]{"//", "/ "};
        int result = new RegionsBySlashes959().regionsBySlashes(grid);
        Assert.assertEquals(3, result);
        grid = new String[]{"/\\", "/\\"};
        result = new RegionsBySlashes959().regionsBySlashes(grid);
        Assert.assertEquals(4, result);
        grid = new String[]{"/\\", "\\/"};
        result = new RegionsBySlashes959().regionsBySlashes(grid);
        Assert.assertEquals(5, result);
    }
}