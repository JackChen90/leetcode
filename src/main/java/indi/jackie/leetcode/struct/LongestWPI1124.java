package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/2/14
 * @description LongestWPI1124
 */
public class LongestWPI1124 {
    /**
     * 乍一看像是滑动窗口, 但抽象不出窗口内/外的计算逻辑
     * 解法采用前缀和 s[i] 表示前i个元素的和, 计算方法是 i>8?1:0
     * <p>
     * 若s[j]>0, j是候选结果
     * 若s[j]<0, 则如果存在s[i] = s[j] -1, 则 i+1~j 的元素的和大于0, 则i-j是候选结果
     *
     * 可以用一个map存储s[j]
     *
     * @param hours 入参数组
     * @return
     */
    public int longestWPI(int[] hours) {
        int ans = 0;
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hours.length; i++) {
            s += hours[i] > 8 ? 1 : -1;
            if (s > 0) {
                ans = Math.max(ans, i + 1);
            } else {
                if (map.containsKey(s - 1)) {
                    ans = Math.max(ans, i - map.get(s - 1));
                }
                //最先放入的, 距离j越远, 所以存在则不替换, 符合题目要求
                map.putIfAbsent(s, i);
            }
        }

        return ans;
    }
}
