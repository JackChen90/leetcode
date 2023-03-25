package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/26
 * @description FindLengthOfShortestSubarray1574Test
 */
public class FindLengthOfShortestSubarray1574Test {

    @Test
    public void findLengthOfShortestSubarray() {
        FindLengthOfShortestSubarray1574 findLengthOfShortestSubarray1574 = new FindLengthOfShortestSubarray1574();
        assertEquals(3, findLengthOfShortestSubarray1574.findLengthOfShortestSubarray(new int[]{1, 2, 3, 10, 4, 2, 3, 5}));
        assertEquals(4, findLengthOfShortestSubarray1574.findLengthOfShortestSubarray(new int[]{5, 4, 3, 2, 1}));
        assertEquals(0, findLengthOfShortestSubarray1574.findLengthOfShortestSubarray(new int[]{1, 2, 3}));
        assertEquals(0, findLengthOfShortestSubarray1574.findLengthOfShortestSubarray(new int[]{1, 2, 3, 4}));
        assertEquals(1, findLengthOfShortestSubarray1574.findLengthOfShortestSubarray(new int[]{1, 2, 3, 5, 6, 4, 7}));
    }
}