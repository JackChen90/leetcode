package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2022/1/3
 * @description DayOfTheWeek1185
 */
public class DayOfTheWeek1185 {

    private static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

    public String dayOfTheWeek(int day, int month, int year) {
        int diffYear = 0;
        for (int i = 1971; i < year; i++) {
            diffYear += isRunNian(i) ? 366 : 365;
        }

        boolean isRunNian = isRunNian(year);
        int diffMonth = 0;
        for (int i = 1; i < month; i++) {
            if (isRunNian && i == 2) {
                diffMonth += 29;
            }
            diffMonth += monthDays[i - 1];
        }

        int totalDiffDays = diffYear + diffMonth + day;
        return week[(totalDiffDays + 3) % 7];
    }

    private boolean isRunNian(int year) {
        //4的倍数且不是100的倍数(特殊情况:400的倍数也是闰年), 年份是闰年
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
