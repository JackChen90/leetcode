package indi.jackie.leetcode.struct;

import java.util.Objects;

public class RemoveTrailingZeros2710 {
    public String removeTrailingZeros(String num) {
        if (Objects.isNull(num) || num.length() == 0) {
            return num;
        }
        int index = num.length();
        while (index > 0 && num.charAt(index - 1) == '0') {
            index--;
        }
        return num.substring(0, index);
    }
}
