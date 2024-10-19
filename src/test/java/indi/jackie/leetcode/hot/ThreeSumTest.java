package indi.jackie.leetcode.hot;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * ThreeSumTest
 *
 * @author jackie chen
 * @date 2024/10/17 9:10 AM
 **/
public class ThreeSumTest {

    @Test
    public void threeSum() {
        int[] param = {-2, 0, 1, 1, 2};
        List<List<Integer>> result;
        ThreeSum threeSum = new ThreeSum();
        result = threeSum.threeSum(param);
        System.out.println(JSON.toJSONString(result));
        param = new int[]{0, 0, 0, 0, 0};
        result = threeSum.threeSum(param);
        System.out.println(JSON.toJSONString(result));
    }
}