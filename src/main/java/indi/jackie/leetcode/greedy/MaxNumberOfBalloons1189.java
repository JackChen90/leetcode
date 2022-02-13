package indi.jackie.leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2022/2/13
 * @description MaxNumberOfBalloons1189
 */
public class MaxNumberOfBalloons1189 {
    private static Character[] characters = {'b', 'a', 'l', 'o', 'n'};

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> bucket = new HashMap<>();
        for (Character character : characters) {
            bucket.put(character, 0);
        }

        Character character;
        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (bucket.containsKey(character)) {
                bucket.put(character, bucket.get(character) + 1);
            }
        }

        bucket.forEach((key, value) -> {
            if (key == 'l' || key == 'o') {
                bucket.put(key, bucket.get(key) / 2);
            }
        });

        return bucket.values().stream().min(Integer::compareTo).orElse(0);
    }
}
