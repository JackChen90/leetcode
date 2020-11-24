package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/11/24
 * @description FindMinArrowShots452Test
 */
public class FindMinArrowShots452Test {

    @Test
    public void findMinArrowShots() {
        int[][] points = createPoints();
        int result = new FindMinArrowShots452().findMinArrowShots(points);
        Assert.assertEquals(2, result);
        points = new int[0][0];
        result = new FindMinArrowShots452().findMinArrowShots(points);
        Assert.assertEquals(0, result);
    }

    private int[][] createPoints() {
        //[[10,16],[2,8],[1,6],[7,12]]
        int[][] points = new int[4][2];
        points[0][0] = 1;
        points[0][1] = 2;
        points[1][0] = 2;
        points[1][1] = 3;
        points[2][0] = 3;
        points[2][1] = 4;
        points[3][0] = 4;
        points[3][1] = 5;
        return points;
    }
}