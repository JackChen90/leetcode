package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2022/9/24
 * @description Decrypt1652Test
 */
public class Decrypt1652Test {

    @Test
    public void decrypt() {
        Decrypt1652 decrypt1652 = new Decrypt1652();

        int[] param = new int[]{5, 7, 1, 4};
        int[] result = decrypt1652.decrypt(param, 3);
        System.out.println(Arrays.toString(result));

        param = new int[]{2,4,9,3};
        result = decrypt1652.decrypt(param, -2);
        System.out.println(Arrays.toString(result));

        result = decrypt1652.decrypt(param, 0);
        System.out.println(Arrays.toString(result));
    }
}