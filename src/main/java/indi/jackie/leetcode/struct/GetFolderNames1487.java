package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/3/3
 * @description GetFolderNames1487
 */
public class GetFolderNames1487 {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();

        List<String> ans = new ArrayList<>();

        for (String name : names) {
            if (map.containsKey(name)) {
                int tailIndex = map.get(name) + 1;
                while (map.containsKey(name + "(" + tailIndex + ")")) {
                    tailIndex++;
                }
                ans.add(name + "(" + tailIndex + ")");
                map.put(name, tailIndex);
                map.put(name + "(" + tailIndex + ")", 0);
            } else {
                ans.add(name);
                map.put(name, 0);
            }
        }

        return ans.toArray(new String[0]);
    }
}
