package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2020/12/24
 * @description Candy135
 */
public class Candy135 {

    /**
     * <p>
     * f[i]的可能解情况
     * d[i]<=d[i-1] 1
     * &nbsp;&nbsp;if(f[i-1]==1 && d[i-1]>d[i]) f[i-1]+=1, 若d[i-2]>d[i-1]&&f[i-2]>=f[i-1] 向前回溯+1
     * d[i]>d[i-1] f[i-1]+1
     * </p>
     * <p>
     * f[0]=1
     * </p>
     * todo 效率很差, 需要优化
     *
     * @param ratings children list
     * @return candy number
     */
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int[] detail = new int[ratings.length];
        detail[0] = 1;
        dispatch(ratings, 1, detail);

        int result = 0;
        for (int value : detail) {
            result += value;
        }
        return result;
    }

    private void dispatch(int[] ratings, int index, int[] detail) {
        if (index == ratings.length) {
            return;
        }

        if (ratings[index] > ratings[index - 1]) {
            detail[index] = detail[index - 1] + 1;
        } else {
            detail[index] = 1;
            if (ratings[index - 1] > ratings[index] && detail[index - 1] == 1) {
                fixPre(ratings, index - 1, detail);
            }
        }
        dispatch(ratings, index + 1, detail);
    }

    private void fixPre(int[] ratings, int index, int[] detail) {
        if (index < 0) {
            return;
        }
        detail[index] = detail[index] + 1;
        if (index > 0 && ratings[index] < ratings[index - 1] && detail[index] == detail[index - 1]) {
            fixPre(ratings, index - 1, detail);
        }
    }
}
