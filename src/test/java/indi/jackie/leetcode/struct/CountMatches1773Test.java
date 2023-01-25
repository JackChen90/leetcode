package indi.jackie.leetcode.struct;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author jackie chen
 * @create 2022/10/29
 * @description CountMatches1773Test
 */
public class CountMatches1773Test {

    @Test
    public void countMatches() {
        CountMatches1773 countMatches1773 = new CountMatches1773();
        List<String> item1 = Lists.newArrayList("phone","blue","pixel");
        List<String> item2 = Lists.newArrayList("computer","silver","phone");
        List<String> item3 = Lists.newArrayList("phone","gold","iphone");
        List<List<String>> data = Lists.newArrayList(item1, item2, item3);
        String ruleKey = "type", ruleValue = "phone";
        int result = countMatches1773.countMatches(data, ruleKey, ruleValue);
        Assert.assertEquals(2, result);
    }
}