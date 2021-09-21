package indi.jackie.leetcode.struct;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2021/9/21
 * @description LengthOfLastWord58
 */
public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        if (Objects.isNull(s) || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }
}
