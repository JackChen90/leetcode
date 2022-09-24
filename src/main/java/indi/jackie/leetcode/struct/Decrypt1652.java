package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/9/24
 * @description Decrypt1652
 */
public class Decrypt1652 {

    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0) {
            return result;
        }

        int direct = k > 0 ? 1 : -1;

        //记录需要统计前/后多少个数的和
        int positiveK = k > 0 ? k : -k;

        for (int i = 0; i < code.length; i++) {
            result[i] = getValue(code, i, positiveK, direct);
        }

        return result;
    }

    private int getValue(int[] code, int index, int positiveK, int direct) {
        int value = 0;
        int currentIndex = index + direct;
        for (int i = 0; i < positiveK; i++) {
            if (currentIndex < 0) {
                currentIndex += code.length;
            }
            if (currentIndex >= code.length) {
                currentIndex -= code.length;
            }
            value += code[currentIndex];
            currentIndex += direct;
        }
        return value;
    }

}
