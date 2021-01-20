package indi.jackie.leetcode.sort;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/11/25
 * @description SortString1370Test
 */
public class SortString1370Test {

    @Test
    public void sortString() {
        String a = "aaaabbbbcccc";
        String result = new SortString1370().sortString(a);
        System.out.println(result);
        a = "leetcode";
        result = new SortString1370().sortString(a);
        System.out.println(result);
        a = "ggggggg";
        result = new SortString1370().sortString(a);
        System.out.println(result);
        a = "spo";
        result = new SortString1370().sortString(a);
        System.out.println(result);
        a = "a";
        result = new SortString1370().sortString(a);
        System.out.println(result);
    }
}