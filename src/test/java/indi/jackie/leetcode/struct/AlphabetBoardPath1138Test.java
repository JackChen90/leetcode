package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2023/2/12
 * @description AlphabetBoardPath1138Test
 */
public class AlphabetBoardPath1138Test {

    @Test
    public void alphabetBoardPath() {
        String target = "leet";

        AlphabetBoardPath1138 alphabetBoardPath1138 = new AlphabetBoardPath1138();

        String result;

//        result = alphabetBoardPath1138.alphabetBoardPath(target);
//
//        Assert.assertEquals("DDR!UURRR!!DDD!", result);
//
//        target = "code";
//        result = alphabetBoardPath1138.alphabetBoardPath(target);
//
//        Assert.assertEquals("RR!DDRR!UUL!R!", result);
//
//        target = "a";
//        result = alphabetBoardPath1138.alphabetBoardPath(target);
//
//        Assert.assertEquals("!", result);

        target = "zdz";
        result = alphabetBoardPath1138.alphabetBoardPath(target);

        Assert.assertEquals("DDDDD!UUUUURRR!DDDDLLLD!", result);

    }
}