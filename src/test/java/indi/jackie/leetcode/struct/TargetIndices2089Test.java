package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/7
 * @description TargetIndices2089Test
 */
public class TargetIndices2089Test {

    @Test
    public void targetIndices() {
        TargetIndices2089 targetIndices2089 = new TargetIndices2089();
        List<Integer> result = targetIndices2089.targetIndices(new int[]{1, 2, 5, 2, 3}, 2);
        System.out.println(result);
    }
}