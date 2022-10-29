package indi.jackie.leetcode.struct;

import java.util.List;

/**
 * @author jackie chen
 * @create 2022/10/29
 * @description CountMatches1773
 */
public class CountMatches1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default:
                break;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
