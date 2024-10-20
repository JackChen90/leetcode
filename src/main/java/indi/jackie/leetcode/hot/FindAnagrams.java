package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 *
 * @author jackie chen
 * @date 2024/10/20 12:26 PM
 **/
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        //下面的滑动窗口, 排序问题
//        char[] sChars = s.toCharArray();
//        char[] pChars = p.toCharArray();
//        Arrays.sort(pChars);
//        int pLength = pChars.length;
//        int sLength = sChars.length;
//        List<Integer> answer = new ArrayList<>();
//
//        for (int i = 0; i < sLength - pLength + 1; i++) {
//            char[] temp = Arrays.copyOfRange(sChars, i, i + pLength);
//            Arrays.sort(temp);
//            if(temp[0] != pChars[0] || temp[pLength - 1] != pChars[pLength - 1]) {
//                continue;
//            }
//            if (Arrays.equals(temp, pChars)) {
//                answer.add(i);
//                while (i < sLength - pLength && sChars[i] == sChars[i + pLength]) {
//                    i++;
//                    answer.add(i);
//                }
//            }
//        }
//        return answer;

        //下面的滑动窗口, 用字母表解决排序带来的耗时
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        int pLength = p.length();
        int sLength = s.length();
        List<Integer> answer = new ArrayList<>();

        if (sLength < pLength) {
            return new ArrayList<>();
        }

        for (int i = 0; i < pLength; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sCount, pCount)) {
            answer.add(0);
        }

        for (int i = 0; i < sLength - pLength; i++) {
            sCount[s.charAt(i + pLength) - 'a']++;
            sCount[s.charAt(i) - 'a']--;
            if (Arrays.equals(sCount, pCount)) {
                answer.add(i  + 1);
            }
        }
        return answer;
    }
}
