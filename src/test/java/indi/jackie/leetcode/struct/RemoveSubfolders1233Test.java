package indi.jackie.leetcode.struct;

import org.junit.Test;

import java.util.List;

/**
 * @author jackie chen
 * @create 2023/2/9
 * @description RemoveSubfolders1233Test
 */
public class RemoveSubfolders1233Test {

    @Test
    public void removeSubfolders() {
        String[] folder = new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        RemoveSubfolders1233 removeSubfolders1233 = new RemoveSubfolders1233();

        List<String> result = removeSubfolders1233.removeSubfolders(folder);
        System.out.println(result);

        folder = new String[]{"/a","/a/b/c","/a/b/d"};
        result = removeSubfolders1233.removeSubfolders(folder);
        System.out.println(result);

        folder = new String[]{"/a/b/c","/a/b/ca","/a/b/d"};
        result = removeSubfolders1233.removeSubfolders(folder);
        System.out.println(result);
    }
}