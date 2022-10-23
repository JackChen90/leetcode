package indi.jackie.leetcode.dp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author jackie chen
 * @create 2022/10/23
 * @description JobScheduling1235
 */
public class JobScheduling1235 {
    /**
     * dp方程
     * f(n)前N个工作的最大报酬
     * f(n) = max(f(n-1), f(j) + profit(n)) 其中, j的结束时间小于n的开始时间
     *
     * @param startTime 开始时间列表
     * @param endTime   结束时间 列表
     * @param profit    报酬
     * @return 最大报酬
     */
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        List<int[]> data = new ArrayList<>();
        int[] item;
        for (int i = 0; i < profit.length; i++) {
            item = new int[]{startTime[i], endTime[i], profit[i]};
            data.add(item);
        }
        data.sort(Comparator.comparingInt(a -> a[1]));

        int[] f = new int[profit.length + 1];
        for (int i = 1; i < profit.length + 1; i++) {
            int s = data.get(i - 1)[0], e = data.get((i - 1))[1], p = data.get((i - 1))[2];
            f[i] = Math.max(f[i - 1], p);

            //这里要优化, 用二分查找, 否则耗时过高
//            for (int j = i - 1; j > 0; j--) {
//                if (data.get(j - 1)[1] <= s) {
//                    f[i] = Math.max(f[i], f[j] + p);
//                }
//            }
            int l = 0, r = i - 1;
            int mid;
            while (l < r) {
                mid = l + r + 1 >> 1;
                if (data.get(mid)[1] <= s) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            if (data.get(r)[1] <= s) {
                f[i] = Math.max(f[i], f[r + 1] + p);
            }
        }

        return f[f.length - 1];
    }
}
