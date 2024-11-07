package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 子集
 *
 * @author jackie chen
 * @date 2024/11/7 9:03 PM
 **/
public class SubsetsTest {

    @Test
    public void subsets() {
        Subsets subsets = new Subsets();
        System.out.println(subsets.subsets(new int[]{1, 2, 3}));
    }
}