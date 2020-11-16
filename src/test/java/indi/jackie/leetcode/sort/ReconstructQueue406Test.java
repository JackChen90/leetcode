package indi.jackie.leetcode.sort;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/11/16
 * @description ReconstructQueue406Test
 */
public class ReconstructQueue406Test {

    @Test
    public void reconstructQueue() {
        int[][] param = createParam();
        int[][] result = new ReconstructQueue406().reconstructQueue(param);
        for (int[] item : result) {
            System.out.print("[" + item[0] + "," + item[1] + "] ");
        }
    }

    private int[][] createParam() {
        //[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
        int[][] param = new int[6][2];
        param[0][0] = 5;
        param[0][1] = 0;
        param[1][0] = 7;
        param[1][1] = 0;
        param[2][0] = 5;
        param[2][1] = 2;
        param[3][0] = 6;
        param[3][1] = 1;
        param[4][0] = 4;
        param[4][1] = 4;
        param[5][0] = 7;
        param[5][1] = 1;
        return param;
    }
}