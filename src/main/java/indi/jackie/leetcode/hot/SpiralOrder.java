package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 螺旋矩阵
 *
 * @author jackie chen
 * @date 2024/10/23 9:16 AM
 **/
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        if (Objects.isNull(matrix) || matrix.length == 0) {
            return answer;
        }
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] direct = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int row = matrix.length;
        int col = matrix[0].length;
        int allCounts = row * col;

        int i = 0;
        int j = 0;
        int redirectCount = 0;
        for (int k = 0; k < allCounts; k++) {
            visited[i][j] = true;
            answer.add(matrix[i][j]);

            int nextDirect = redirectCount % 4;
            int nextI = i + direct[nextDirect][0];
            int nextJ = j + direct[nextDirect][1];
            if (nextI < 0 || nextI >= row || nextJ < 0 || nextJ >= col || visited[nextI][nextJ]) {
                redirectCount++;
                nextDirect = redirectCount % 4;
                nextI = i + direct[nextDirect][0];
                nextJ = j + direct[nextDirect][1];
            }
            i = nextI;
            j = nextJ;
        }
        return answer;
    }
}
