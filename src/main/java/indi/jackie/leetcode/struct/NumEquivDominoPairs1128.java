package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author jackie chen
 * @create 2021/1/26
 * @description NumEquivDominoPairs1128
 */
public class NumEquivDominoPairs1128 {

    /**
     * <p>
     * 这个思路是利用hashmap来解, 构建一个Element类作为hashmap的key, 重载Element类的equals&hashcode方法, 使得key的相等满足题中的相等条件
     * 最后的结果要用斐波那契数列求和的方法计算组合数
     * </p>
     * <p>
     * ps: 一种取巧的方法: 利用元素都不大于10的特点, 同时优化"判断相等"和"计算组合"两个关键点
     * 构建100长度的一维数组, num[100]
     * 取一维数组, 命名item, 计算 val = min(item[0], item[1]) * 10 + min(item[0], item[1]); result+=num[val]; num[val]++;
     * return result;
     * </p>
     *
     * @param dominoes 入参数组
     * @return 相同的组合数
     */
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Element, Integer> map = new HashMap<>(dominoes.length);
        for (int[] item : dominoes) {
            Element element = new Element(item);
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count + 1);
            } else {
                map.put(element, 1);
            }
        }

        int result = 0;
        for (Element element : map.keySet()) {
            result += fib(map.get(element) - 1);
        }
        return result;
    }

    private int fib(int x) {
        if (x == 0) {
            return 0;
        }
        return x + fib(x - 1);
    }

    private static class Element {
        private int[] items;

        Element(int[] items) {
            this.items = items;
        }

        @Override
        public boolean equals(Object obj) {
            if (Objects.isNull(obj) || !(obj instanceof Element)) {
                return false;
            }
            Element other = (Element) obj;
            return (items[0] == other.items[0] && items[1] == other.items[1]) ||
                    (items[0] == other.items[1] && items[1] == other.items[0]);
        }

        @Override
        public int hashCode() {
            return items[0] + items[1];
        }
    }

}
