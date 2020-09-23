package indi.jackie.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2020/9/21
 * @description LongestHappyString1405
 */
public class LongestHappyString1405 {

    private String result = "";

    private List<HappyString> happyStrings = new ArrayList<>();

    public String longestDiverseString(int a, int b, int c) {
        init(a, b, c);
        appendHappyString();
        return result;
    }

    private void appendHappyString() {
        happyStrings.sort((o1, o2) -> o1.number.equals(o2.number) ? 0 : o1.number > o2.number ? -1 : 1);
        if (happyStrings.get(0).number == 0) {
            return;
        }
        if (result.length() > 1 && result.endsWith(happyStrings.get(0).code + happyStrings.get(0).code)) {
            if (happyStrings.get(1).number == 0) {
                return;
            }
            result += happyStrings.get(1).code;
            happyStrings.get(1).number -= 1;
            appendHappyString();
        } else {
            result += happyStrings.get(0).code;
            happyStrings.get(0).number -= 1;
            appendHappyString();
        }
    }

    private void init(int a, int b, int c) {
        HappyString temp = new HappyString("a", a);
        happyStrings.add(temp);
        temp = new HappyString("b", b);
        happyStrings.add(temp);
        temp = new HappyString("c", c);
        happyStrings.add(temp);
    }

    private static class HappyString implements Comparable<HappyString> {
        private String code;
        private Integer number;

        HappyString(String code, Integer number) {
            this.code = code;
            this.number = number;
        }

        @Override
        public int compareTo(HappyString o) {
            return this.number.compareTo(o.number);
        }
    }
}
