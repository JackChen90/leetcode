package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2020/10/19
 * @description Triangle120Test
 */
public class Triangle120Test {

    @Test
    public void minimumTotal() {
        List<List<Integer>> triangle = createTriangle();
        int result = new Triangle120().minimumTotal(triangle);
        Assert.assertEquals(11, result);
    }

    private List<List<Integer>> createTriangle() {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row1 = Arrays.asList(2);
        List<Integer> row2 = Arrays.asList(3, 4);
        List<Integer> row3 = Arrays.asList(6, 5, 7);
        List<Integer> row4 = Arrays.asList(4, 1, 8, 3);
        triangle.add(row1);
        triangle.add(row2);
        triangle.add(row3);
        triangle.add(row4);
        return triangle;
    }
}