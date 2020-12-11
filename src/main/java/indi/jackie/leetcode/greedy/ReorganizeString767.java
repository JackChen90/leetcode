package indi.jackie.leetcode.greedy;

import java.util.*;

/**
 * @author jackie chen
 * @create 2020/11/30
 * @description ReorganizeString767
 */
public class ReorganizeString767 {
    private boolean illegal = false;
    private String result = "";

    public String reorganizeString(String s) {
        List<DataNode> data = init(s);
        Collections.sort(data);
        if (data.get(0).count > (s.length() + 1) / 2) {
            return "";
        }
        appendString(data);
        return illegal ? "" : result;
    }

    private void appendString(List<DataNode> data) {
        if (data.get(0).count == 0) {
            return;
        }
        if (result.endsWith(data.get(0).code)) {
            result += data.get(1).code;
            data.get(1).count--;
        } else {
            result += data.get(0).code;
            data.get(0).count--;
        }
        Collections.sort(data);
        appendString(data);
    }

    private List<DataNode> init(String s) {
        List<DataNode> data = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c + "")) {
                map.put(c + "", map.get(c + "") + 1);
                continue;
            }
            map.put(c + "", 1);
        }
        map.forEach((key, value) -> {
            data.add(new DataNode(key, value));
        });
        return data;
    }

    private static class DataNode implements Comparable<DataNode> {

        private String code;
        private Integer count;

        private DataNode(String code, Integer count) {
            this.code = code;
            this.count = count;
        }

        @Override
        public int compareTo(DataNode o) {
            if (this.count.equals(o.count)) {
                return this.code.compareTo(o.code);
            } else {
                return Integer.compare(o.count, this.count);
            }
        }
    }
}
