package indi.jackie.leetcode.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2022/2/19
 * @description PancakeSort969
 */
public class PancakeSort969 {

    /**
     * 思路是冒泡排序的思想 把最大值先翻转到最右侧
     *
     * @param arr 入参
     * @return 翻转步骤列表
     */
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        int[] idxs = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            idxs[arr[i]] = i;
        }

        for (int k = n; k >= 1; k--) {
            if (idxs[k] == k - 1) {
                continue;
            }
            if (idxs[k] != 0) {
                result.add(idxs[k] + 1);
                reverse(arr, 0, idxs[k], idxs);
            }
            result.add(k);
            reverse(arr, 0, k - 1, idxs);
        }

        return result;
    }

    private void reverse(int[] arr, int i, int j, int[] idxs) {
        while (i < j) {
            idxs[arr[i]] = j;
            idxs[arr[j]] = i;

            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
    }
}
