package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/2/20
 * @description BestHand2347
 */
public class BestHand2347 {
    public String bestHand(int[] ranks, char[] suits) {
        char suit0 = suits[0];
        boolean flush = true;
        for (char suit : suits) {
            if (suit0 != suit) {
                flush = false;
                break;
            }
        }

        if (flush) {
            return "Flush";
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int rank : ranks) {
            if (map.containsKey(rank)) {
                map.put(rank, map.get(rank) + 1);
                if (map.get(rank) == 3) {
                    return "Three of a Kind";
                }
            } else {
                map.put(rank, 1);
            }
        }

        return map.keySet().size() == 5 ? "High Card" : "Pair";
    }
}
