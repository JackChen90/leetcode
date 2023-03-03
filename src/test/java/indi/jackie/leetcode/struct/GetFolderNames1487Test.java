package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/3
 * @description GetFolderNames1487Test
 */
public class GetFolderNames1487Test {

    @Test
    public void getFolderNames() {
        GetFolderNames1487 getFolderNames1487 = new GetFolderNames1487();
        String[] result = getFolderNames1487.getFolderNames(new String[]{"pes", "fifa", "gta", "pes(2019)"});
        System.out.println(Arrays.toString(result));
        result = getFolderNames1487.getFolderNames(new String[]{"kaido","kaido(1)","kaido","kaido(1)","kaido(2)"});
        System.out.println(Arrays.toString(result));
    }
}