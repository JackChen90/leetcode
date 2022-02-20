package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/2/20
 * @description IsOneBitCharacter717
 */
public class IsOneBitCharacter717 {
    public boolean isOneBitCharacter(int[] bits) {
        int length = bits.length;
        if (length == 1) {
            //题目要求, bits的结尾一定是0
            return true;
        }
        //结尾必须是00一定是单字符(已知最后一位一定是0)
        int last02 = bits[bits.length - 2];
        if (last02 == 0) {
            return true;
        }

        //从后往前, 到第一个0为止. 如果有偶数个1一定是单字符
        int oneCount = 0;
        for (int i = length - 2; i >= 0; i--) {
            if (bits[i] == 1) {
                oneCount++;
            } else {
                break;
            }
        }
        return oneCount % 2 != 1;
    }
}
