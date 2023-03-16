package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/16
 * @description SummaryRanges228Test
 */
public class SummaryRanges228Test {

    @Test
    public void summaryRanges() {
        SummaryRanges228 summaryRanges228 = new SummaryRanges228();
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges228.summaryRanges(nums));
        nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges228.summaryRanges(nums));
        nums = new int[]{-1};
        System.out.println(summaryRanges228.summaryRanges(nums));
        nums = new int[]{};
        System.out.println(summaryRanges228.summaryRanges(nums));
    }
}