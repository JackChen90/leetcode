package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/3/16
 * @description SummaryRanges228
 */
public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }

        if (nums.length == 1) {
            ans.add(nums[0] + "");
            return ans;
        }

        int startNum = nums[0];
        int currentNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNum + 1) {
                currentNum = nums[i];
            } else {
                if (currentNum == startNum) {
                    ans.add(String.valueOf(currentNum));
                } else {
                    ans.add(startNum + "->" + currentNum);
                }
                currentNum = nums[i];
                startNum = nums[i];
            }

            if (i == nums.length - 1) {
                if (currentNum == startNum) {
                    ans.add(String.valueOf(currentNum));
                } else {
                    ans.add(startNum + "->" + currentNum);
                }
            }
        }

        return ans;
    }
}
