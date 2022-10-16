package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/10/16
 * @description PossibleBipartition886Test
 */
public class PossibleBipartition886Test {

    @Test
    public void possibleBipartition() {
        PossibleBipartition886 possibleBipartition886 = new PossibleBipartition886();

        //[[1,2],[1,3],[2,4]]
        int n = 4;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 4}};

        boolean result = possibleBipartition886.possibleBipartition(n, dislikes);
        Assert.assertTrue(result);
    }
}