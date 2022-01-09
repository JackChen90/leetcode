package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/1/9
 * @description SlowestKey1629
 */
public class SlowestKey1629 {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] chars = keysPressed.toCharArray();
        int maxIndex = 0;
        int maxDiff = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] > maxDiff) {
                maxDiff = releaseTimes[i] - releaseTimes[i - 1];
                maxIndex = i;
            }
            if (releaseTimes[i] - releaseTimes[i - 1] == maxDiff) {
                if (chars[i] > chars[maxIndex]) {
                    maxDiff = releaseTimes[i] - releaseTimes[i - 1];
                    maxIndex = i;
                }
            }
        }
        return chars[maxIndex];
    }
}
