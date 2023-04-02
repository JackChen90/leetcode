package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2023/4/2
 * @description MinScoreTriangulation1039Test
 */
public class MinScoreTriangulation1039Test {

    @Test
    public void minScoreTriangulation() {

        int[] param = new int[]{3, 3, 6, 2, 1, 4};

        MinScoreTriangulation1039 minScoreTriangulation1039 = new MinScoreTriangulation1039();
        int ans = minScoreTriangulation1039.minScoreTriangulation(param);

        Assert.assertEquals(51, ans);
    }
}