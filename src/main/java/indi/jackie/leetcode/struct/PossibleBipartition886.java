package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jackie chen
 * @create 2022/10/16
 * @description PossibleBipartition886
 */
public class PossibleBipartition886 {

    public boolean possibleBipartition(int n, int[][] dislikes) {

        int[] color = new int[n+1];

        List<Integer>[] graph = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] dislike : dislikes) {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            if (color[i] == 0) {
                queue.add(i);
                color[i] = 1;
                while (!queue.isEmpty()) {
                    int t = queue.poll();
                    for (Integer next : graph[t]) {
                        if (color[next] != 0 && color[next] == color[t]) {
                            return false;
                        }

                        if (color[next] == 0) {
                            color[next] = 3 ^ color[t];
                            queue.offer(next);
                        }
                    }

                }
            }
        }

        return true;
    }
}
