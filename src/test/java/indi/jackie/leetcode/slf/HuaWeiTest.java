package indi.jackie.leetcode.slf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author jackie chen
 * @create 2020/10/18
 * @description HuaWeiTest
 */
public class HuaWeiTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readLength = scanner.nextInt();
        int arrayCount = scanner.nextInt();
        List<String> arrays = new ArrayList<>();
        for (int i = 0; i < arrayCount; i++) {
            String temp = scanner.next();
            arrays.add(temp);
        }

        List<List<Integer>> data = new ArrayList<>();
        arrays.forEach(t -> {
            List<Integer> temp = Arrays.stream(t.split(",")).map(Integer::parseInt).collect(Collectors.toList());
            data.add(temp);
        });

        List<Integer> result = new ArrayList<>();
        while (!done(data)) {
            data.forEach(t -> {
                int size = t.size();
                for (int i = 0; i < readLength && i < size; i++) {
                    result.add(t.get(i));
                }
                for (int i = 0; i < readLength && i < size; i++) {
                    t.remove(0);
                }
            });
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i == result.size() - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();
    }

    private static boolean done(List<List<Integer>> data) {
        for (List<Integer> datum : data) {
            if (datum != null && datum.size() > 0) {
                return false;
            }
        }
        return true;
    }
}
