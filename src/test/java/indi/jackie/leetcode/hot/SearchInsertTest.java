package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2024/11/3
 * @description SearchInsertTest
 */
public class SearchInsertTest {

    @Test
    public void searchInsert() {
        SearchInsert searchInsert = new SearchInsert();
//        assertEquals(2, searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5));
//        assertEquals(1, searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 2));
//        assertEquals(4, searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7));
//        assertEquals(0, searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(3, searchInsert.searchInsert(new int[]{3,5,7,9,10}, 8));
    }
}