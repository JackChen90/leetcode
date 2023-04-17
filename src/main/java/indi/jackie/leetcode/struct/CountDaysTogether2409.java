package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/4/17
 * @description CountDaysTogether2409
 */
public class CountDaysTogether2409 {
    private static final int[] MONTH_DAYS = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startA = parseDate(arriveAlice);
        int endA = parseDate(leaveAlice);

        int startB = parseDate(arriveBob);
        int endB = parseDate(leaveBob);

        int ans = 0;

        for (int i = startA; i <= endA; i++) {
            if (i >= startB && i <= endB) {
                ans++;
            }
        }

        return ans;
    }

    private int parseDate(String arriveAlice) {
        String[] temp = arriveAlice.split("-");
        int month = Integer.parseInt(temp[0]);
        int day = Integer.parseInt(temp[1]);

        int dateOfInt = 0;
        for (int i = 0; i < month - 1; i++) {
            dateOfInt += MONTH_DAYS[i];
        }

        return dateOfInt + day;
    }
}
