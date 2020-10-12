package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2020/10/12
 * @description LRUCache146Test
 */
public class LRUCache146Test {

    @Test
    public void test() {
        int result;
        int capacity = 3;
        LRUCache146 lruCache146 = new LRUCache146(capacity);
        lruCache146.put(1, 1);
        lruCache146.put(2, 2);
        lruCache146.put(3, 3);
        result = lruCache146.get(2);
        Assert.assertEquals(2, result);
        lruCache146.put(4, 4);
        result = lruCache146.get(1);
        Assert.assertEquals(-1, result);
    }
}