package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/11/1
 * @description ArrayStringsAreEqual1662
 */
public class ArrayStringsAreEqual1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        return str1.equals(str2);
    }
}
