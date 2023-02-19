package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/2/18
 * @description FindSolution1237
 */
public class FindSolution1237 {
    /**
     * 题目限定条件 0< x,y <=1000
     * <p>
     * 纯数学题, 意义不大
     * <p>
     * 可以根据题目的条件, 设定条件边界
     *
     * @param customfunction 自定义function
     * @param z              自定义function结果
     * @return
     */
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int x = 1; x < 1001; x++) {
            int leftY = 1, rightY = 1000;
            while (leftY <= rightY) {
                int middleY = (leftY + rightY) / 2;

                if (customfunction.f(x, middleY) == z) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(x);
                    pair.add(middleY);
                    ans.add(pair);
                    //函数是严格单调递增, 直接break
                    break;
                }

                if (customfunction.f(x, middleY) > z) {
                    rightY -= 1;
                } else {
                    leftY += 1;
                }
            }
        }

        return ans;
    }


    interface CustomFunction {
        int f(int x, int y);
    }
}
