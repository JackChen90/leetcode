package indi.jackie.leetcode.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2020/11/16
 * @description ReconstructQueue406
 */
public class ReconstructQueue406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));

        List<int[]> list = new LinkedList<>();
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
