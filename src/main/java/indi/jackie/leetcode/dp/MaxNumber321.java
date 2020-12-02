package indi.jackie.leetcode.dp;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2020/12/2
 * @description MaxNumber321
 */
public class MaxNumber321 {
    //考虑长度
    //留足长度后, 尽量选最大的, 每次选中了, 长度减一
    //难点在留足长度和选取最大的之间有可能存在矛盾
    //要考虑位置的"顺序"
    //选定第一个数很重要

    private int order1 = 0, order2 = 0;

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        List<DataNode> data1 = initData(nums1);
        List<DataNode> data2 = initData(nums2);
        data1.sort((o1, o2) -> Integer.compare(o2.number, o1.number));
        data2.sort((o1, o2) -> Integer.compare(o2.number, o1.number));

        List<Integer> result = new LinkedList<>();

        int i1 = order1;
        int i2 = order2;
        while (true) {
            if (data1.get(i1).number > data2.get(i2).number) {
                if (data1.size() - data1.get(i1).order + data2.size() >= k) {
                    order1 = data1.get(i1).order;
                    result.add(data1.get(i1).number);
                    break;
                }
                i1++;
            } else {
                if (data2.size() - data2.get(i2).order + data1.size() >= k) {
                    order2 = data2.get(i2).order;
                    result.add(data2.get(i2).number);
                    break;
                }
                i2++;
            }
        }

        return null;
    }

    private List<DataNode> initData(int[] nums) {
        List<DataNode> dataNodes = new LinkedList<>();
        int i = 0;
        for (int num : nums) {
            dataNodes.add(new DataNode(num, i++));
        }
        return dataNodes;
    }

    private static class DataNode {
        private Integer number;
        private Integer order;

        public DataNode(Integer number, Integer order) {
            this.number = number;
            this.order = order;
        }
    }
}
