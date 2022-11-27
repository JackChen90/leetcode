package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/11/27
 * @description Check1752
 */
public class Check1752 {

    /**
     * 所谓轮转, 是将index=0的元素挪到数组末尾或者将index=nums.length的元素挪到数组起始位置
     *
     * @param nums
     * @return
     */
    public boolean check(int[] nums) {
        int k = nums.length;

        int minIndex = 0;
        for (int i = 1; i < k; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
                continue;
            }
            //这里注意如果有相同最小值的时候, 需要取下标更靠前的元素
            if (nums[i] == nums[minIndex]) {
                if (nums[(i + k - 1) % k] > nums[i]) {
                    minIndex = i;
                }
            }
        }

        for (int i = 0; i < k - 1; i++) {
            if (nums[(minIndex + i + 1) % k] < nums[(minIndex + i) % k]) {
                return false;
            }
        }
        return true;
    }
}
