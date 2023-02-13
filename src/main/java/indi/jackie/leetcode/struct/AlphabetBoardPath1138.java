package indi.jackie.leetcode.struct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackie chen
 * @create 2023/2/12
 * @description AlphabetBoardPath1138
 */
public class AlphabetBoardPath1138 {
    Map<Character, Direct> map = new HashMap<>(26);

    String LEFT = "LLLLLL";
    String RIGHT = "RRRRRR";
    String UP = "UUUUUU";
    String DOWN = "DDDDDD";

    public String alphabetBoardPath(String target) {
        initMap();

        StringBuilder sb = new StringBuilder();

        Character currentChar = 'a';
        for (char item : target.toCharArray()) {
            sb.append(appendResult(currentChar, item));
            sb.append("!");
            currentChar = item;
        }

        return sb.toString();
    }

    private String appendResult(Character currentChar, Character nextChar) {
        boolean currentCharIsZ = false;
        boolean nextCharIsZ = false;
        if (currentChar == 'z') {
            currentCharIsZ = true;
            currentChar = 'u';
        }
        if (nextChar == 'z') {
            nextCharIsZ = true;
            nextChar = 'u';
        }
        Direct pre = map.get(currentChar);
        Direct next = map.get(nextChar);
        String result = calculateDirect(pre.down - next.down, pre.right - next.right);
        if (currentCharIsZ && nextCharIsZ) {
            return result;
        }

        if (currentCharIsZ) {
            result = "U" + result;
        }
        if (nextCharIsZ) {
            result = result + "D";
        }
        return result;
    }

    private String calculateDirect(Integer down, Integer right) {
        String direct = "";

        if (down > 0) {
            direct += UP.substring(0, down);
        } else {
            direct += DOWN.substring(0, -down);
        }

        if (right > 0) {
            direct += LEFT.substring(0, right);
        } else {
            direct += RIGHT.substring(0, -right);
        }
        return direct;
    }

    private void initMap() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 5 && j > 0) {
                    return;
                }
                map.put(alphabet.charAt(index), new Direct(i + 1, j + 1));
                index++;
            }
        }
    }

    private static class Direct {
        private Integer down;
        private Integer right;

        public Direct(int down, int right) {
            this.down = down;
            this.right = right;
        }
    }
}
