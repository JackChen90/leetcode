package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2024/11/3
 * @description GenerateTest
 */
public class GenerateTest {

    @Test
    public void generate() {
        Generate generate = new Generate();
        assertEquals(5, generate.generate(5).size());
        assertEquals(1, generate.generate(1).size());
        assertEquals(2, generate.generate(2).size());
        assertEquals(3, generate.generate(3).size());
        assertEquals(4, generate.generate(4).size());
    }
}