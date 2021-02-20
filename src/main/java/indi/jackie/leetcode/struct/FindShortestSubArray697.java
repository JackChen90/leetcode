package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author jackie chen
 * @create 2021/2/20
 * @description FindShortestSubArray697
 */
public class FindShortestSubArray697 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        Map<Integer, NumStat> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (Objects.isNull(map.get(nums[i]))) {
                NumStat numStat = new NumStat();
                numStat.count = 1;
                numStat.startIndex = i;
                map.put(nums[i], numStat);
                continue;
            }
            NumStat numStat = map.get(nums[i]);
            numStat.count += 1;
            numStat.length = i - numStat.startIndex + 1;
        }

        return map.values().stream().max((o1, o2) -> {
            if (o1.count == o2.count) {
                return Integer.compare(o2.length, o1.length);
            } else {
                return Integer.compare(o1.count, o2.count);
            }
        }).map(t -> t.length).orElse(0);
    }


    private static class NumStat implements Comparable {
        private int count;
        private int startIndex;
        private int length = 1;

        @Override
        public int compareTo(Object o) {
            if (!(o instanceof NumStat)) {
                return -1;
            }
            NumStat other = (NumStat) o;

            if (this.count == other.count) {
                return Integer.compare(other.length, this.length);
            } else {
                return Integer.compare(other.count, this.count);
            }
        }
    }
}
