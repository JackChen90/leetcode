package indi.jackie.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2022/7/3
 * @description NextGreaterElement556
 * <p>
 * 思路:
 * 假设存在位置idx, 替换掉该位置的数, 满足题目要求. idx应有以下特征
 * 1. idx越靠近低位越好
 * 2. idx被替换的数应该是(idx, end]中比idx大的数中最小的数
 * 3. 替换掉idx后, (idx, end]应该升序排列, 才能保证最小大于原数
 * <p>
 * 实现方式:
 * 1. 从低位往高位遍历
 * 2. 排序(idx, end], 升序
 * 3. 比较(idx, end]的数中, 存在比idx大的数, 直接替换
 */
public class NextGreaterElement556 {
    public int nextGreaterElement(int n) {
        char[] characters = String.valueOf(n).toCharArray();
        int end = characters.length;

        for (int i = end - 2; i >= 0; i--) {

            //调优: 从低位开始往高位找, 在找到第一个"下降"之前, 直接继续下一轮(此时不可能执行替换完成题意)
            if (characters[i + 1] <= characters[i]) {
                continue;
            }

            Arrays.sort(characters, i + 1, end);

            for (int j = i + 1; j < end; j++) {
                if (characters[j] > characters[i]) {
                    swap(characters, i, j);
                    if (Long.parseLong(String.valueOf(characters)) > Integer.MAX_VALUE) {
                        return -1;
                    }
                    return Integer.parseInt(String.valueOf(characters));
                }
            }
        }
        return -1;
    }

    private void swap(char[] characters, int i, int j) {
        char item = characters[i];
        characters[i] = characters[j];
        characters[j] = item;
    }
}
