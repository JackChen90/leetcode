package indi.jackie.leetcode.slf;

import java.util.*;

/**
 * @author jackie chen
 * @create 2020/10/18
 * @description HuaWeiTest3
 */
public class HuaWeiTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int speed = scanner.nextInt();

        Map<Integer, Integer> ready = new TreeMap<>();
        int firstEat = Integer.MAX_VALUE, lastEat = 0;
        for (int i = 0; i < count; i++) {
            int canEatTime = scanner.nextInt() + scanner.nextInt();
            ready.put(canEatTime, 1);
            if (firstEat > canEatTime) {
                firstEat = canEatTime;
            }
            if (lastEat < canEatTime) {
                lastEat = canEatTime;
            }
        }

        int eatCount = 0;
        int index = firstEat;
        while (index <= lastEat) {
            if (Objects.isNull(ready.get(index))) {
                index += 1;
                continue;
            }
            eatCount += ready.get(index);
            index += speed;
        }

        System.out.println(eatCount);
    }
}
