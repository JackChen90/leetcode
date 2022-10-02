package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/10/3
 * @description CheckOnesSegment1784
 */
public class CheckOnesSegment1784 {
    public boolean checkOnesSegment(String s) {
        int firstZero = s.indexOf('0');
        int lastOne = s.lastIndexOf('1');
        return firstZero == -1 || lastOne < firstZero;
    }
}
