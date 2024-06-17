package indi.jackie.leetcode.struct;

public class FindLUSlength522 {
    /**
     * 一个数学推演:
     * '特殊序列'如果存在, 一定是数组中的某个字符串.
     * <p>
     * 因为如果 sub 没有在除了 str[i] 之外的字符串中以子序列的形式出现过，那么给 sub 不断地添加字符，它也不会出现。而 str[i] 就是 sub 添加若干个（可以为零个）字符得到的结果。
     * </p>
     * 因此简化为两层循环, 判断当前是否是其他字符串的'子序列'即可
     *
     * @param strs 入参
     * @return 最长'特殊序列'长度
     */
    public int findLUSlength(String[] strs) {
        int ans = -1;
        for (int i = 0; i < strs.length; i++) {
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isSub(strs[i], strs[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans = Math.max(ans, strs[i].length());
            }
        }
        return ans;
    }

    /**
     * 子序列判断
     * @param a 待判定'子序列'
     * @param b 原串
     * @return a是否是b的'子序列'
     */
    private boolean isSub(String a, String b) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < a.length() && index2 < b.length()) {
            if (a.charAt(index1) == b.charAt(index2)) {
                index1++;
            }
            index2++;
        }
        return index1 == a.length();
    }
}
