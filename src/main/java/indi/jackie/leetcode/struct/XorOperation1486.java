package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/4/16
 * @description XorOperation1486
 */
public class XorOperation1486 {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= start + 2 * i;
        }

        return ans;
    }
}
