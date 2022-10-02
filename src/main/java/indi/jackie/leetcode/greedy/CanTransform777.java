package indi.jackie.leetcode.greedy;

/**
 * 此题的关键点在于理解L向左移动, R向右移动, L和R相互不能跨越. 去掉X后, 两个字符串应该完全相同
 *
 * @author jackie chen
 * @create 2022/10/3
 * @description CanTransform777
 */
public class CanTransform777 {
    /**
     * @param start
     * @param end
     * @return
     */
    public boolean canTransform(String start, String end) {
        if (start.length() != end.length()) {
            return false;
        }
        int strLength = start.length();
        int i = 0, j = 0;
        while (true) {
            while (i < strLength && start.charAt(i) == 'X') {
                i++;
            }
            while (j < strLength && end.charAt(j) == 'X') {
                j++;
            }

            if (i == strLength && j == strLength) {
                return true;
            }

            if (i == strLength || j == strLength || start.charAt(i) != end.charAt(j)) {
                return false;
            }
            if (start.charAt(i) == 'L' && i < j) {
                return false;
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }
    }
}
