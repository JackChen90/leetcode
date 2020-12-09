package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2020/12/2
 * @description MaxNumber321
 */
public class MaxNumber321 {
    /**
     * 对于一个数组, 移除k个数字, 使得剩下的数字组成的数(不改变数字原有顺序)最大/最小是可解的. 数据结构:栈
     * 两个数组, 需要多一个合并的操作. 即数组1取m个数, 数组2取n个数, 其中m+n=k, 且m需要经历从0-k的一个穷举(相应的n会从k-0)过程
     * 合并的操作, 需要比较两个栈的字典序
     * todo 代码执行效率低, 待优化
     */
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        String result = "";
        String compareStr = "";

        int[] pick1;
        int[] pick2;

        int index;
        if (nums1.length == 0) {
            index = Math.min(nums2.length, k);
        } else {
            index = Math.min(Math.min(nums1.length, nums2.length), k);
        }
        for (int i = 0; i <= index; i++) {
            if (i + nums2.length < k) {
                continue;
            }
            if (i > nums1.length) {
                break;
            }
            pick1 = pick(nums1, i);
            pick2 = pick(nums2, k - i);
            compareStr = merge(pick1, pick2);
            if (compareStr.compareTo(result) > 0) {
                result = compareStr;
            }
        }

        int[] array = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            array[i] = Character.getNumericValue(result.charAt(i));
        }
        return array;
    }

    private String merge(int[] pick1, int[] pick2) {
        StringBuilder sb = new StringBuilder();
        int index1 = 0, index2 = 0;
        while (index1 < pick1.length || index2 < pick2.length) {
            if (index1 == pick1.length) {
                sb.append(pick2[index2++]);
                continue;
            }
            if (index2 == pick2.length) {
                sb.append(pick1[index1++]);
                continue;
            }
            if (array2String(pick1, index1).compareTo(array2String(pick2, index2)) > 0) {
                sb.append(pick1[index1++]);
            } else {
                sb.append(pick2[index2++]);
            }
        }
        return sb.toString();
    }

    private String array2String(int[] pick, int index) {
        StringBuilder result = new StringBuilder();
        for (int i = index; i < pick.length; i++) {
            result.append(pick[i]);
        }
        return result.toString();
    }

    private int[] pick(int[] nums, int pick) {
        int[] result = new int[nums.length];
        int remove = nums.length - pick;
        if (remove == nums.length) {
            return new int[0];
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[index++] = nums[i];
                continue;
            }
            while (remove > 0 && index > 0 && result[index - 1] < nums[i]) {
                remove--;
                index--;
            }
            result[index++] = nums[i];
        }
        int[] subResult = new int[pick];
        System.arraycopy(result, 0, subResult, 0, pick);
        return subResult;
    }
}
