package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/11/3
 * @description MaxRepeating1668
 */
public class MaxRepeating1668 {
    public int maxRepeating(String sequence, String word) {
        int repeat = 0;
        String subSequence = word;
        while (true) {
            if (sequence.contains(subSequence)) {
                repeat++;
                subSequence += word;
            } else {
                break;
            }
        }
        return repeat;
    }
}
