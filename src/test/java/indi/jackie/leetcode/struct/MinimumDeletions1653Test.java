package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/6
 * @description MinimumDeletions1653Test
 */
public class MinimumDeletions1653Test {

    @Test
    public void minimumDeletions() {
        MinimumDeletions1653 minimumDeletions1653 = new MinimumDeletions1653();
        String s = "bbbbbbbaabbbbbaaabbbabbbbaabbbbbbaabbaaabaabbbaaaabaaababbbabbabbaaaabbbabbbbbaabbababbbaaaaaababaaababaabbabbbaaaabbbbbabbabaaaabbbaba";
        int result = minimumDeletions1653.minimumDeletions(s);
        System.out.println(result);

        s = "a";
        result = minimumDeletions1653.minimumDeletions(s);
        System.out.println(result);
    }
}