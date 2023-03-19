package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/19
 * @description RepeatedSubstringPattern459
 */
public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i <= length / 2; i++) {
            if (length % i != 0) {
                continue;
            }

            StringBuilder ans = new StringBuilder();
            String sub = s.substring(0, i);
            int j = length / i;
            for (int k = 0; k < j; k++) {
                ans.append(sub);
            }
            if (ans.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
