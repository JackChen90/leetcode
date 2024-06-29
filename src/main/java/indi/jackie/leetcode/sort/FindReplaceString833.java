package indi.jackie.leetcode.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindReplaceString833 {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        //一个排序技巧，用一个list记录下标, 然后根据下标对应数组值的比较结果排序下标. 解决多个数组按照其中一个数组的大小进行排序的问题
        List<Integer> ops = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            ops.add(i);
        }
        ops.sort(Comparator.comparingInt(o -> indices[o]));

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < ops.size(); i++) {
            int op = ops.get(i);
            String source = sources[op];
            String target = targets[op];
            int idx = indices[op];
            if (s.startsWith(source, idx)) {
                sb.append(s, index, idx);
                sb.append(target);
                index = idx + source.length();
            } else {
                int j = i + 1;
                int nextOp = 0;
                while (j < ops.size() && indices[ops.get(j)] == idx) {
                    nextOp = ops.get(j);
                    source = sources[nextOp];
                    target = targets[nextOp];
                    if (s.startsWith(source, idx)) {
                        sb.append(s, index, idx);
                        sb.append(target);
                        index = idx + source.length();
                        //跳过下一个
                        i = j;
                        break;
                    }
                    j++;
                }
            }
        }
        sb.append(s, index, s.length());
        return sb.toString();
    }
}
