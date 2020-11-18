package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2020/11/16
 * @description RemoveKdigits402
 */
public class RemoveKdigits402 {
    public String removeKdigits(String num, int k) {
        if (k == 0) {
            return num;
        }
        if (num.length() <= k) {
            return "0";
        }
        int index = 0;
        while (k > 0 || (num.charAt(0) == '0' && num.length() > 1)) {
            if (num.length() == 0) {
                num = "0";
                break;
            }
            if (num.charAt(0) == '0') {
                num = num.substring(1);
                continue;
            }
            if (num.charAt(index) > num.charAt(index + 1)) {
                num = num.substring(0, index) + num.substring(index + 1);
                k--;
                index = index == 0 ? 0 : index - 1;
                continue;
            }
            index++;
            if (index == num.length() - 1) {
                num = num.substring(0, index);
                k--;
                index -= 2;
            }
        }
        return num;
    }
}
