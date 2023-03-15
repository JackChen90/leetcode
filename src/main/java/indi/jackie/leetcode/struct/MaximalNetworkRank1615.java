package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/15
 * @description MaximalNetworkRank1615
 */
public class MaximalNetworkRank1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] isConnected = new boolean[n][n];
        // 记录每个节点的度(所谓城市的秩)
        int[] degree = new int[n];
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
            isConnected[road[0]][road[1]] = true;
            isConnected[road[1]][road[0]] = true;
        }

        int maxDegree = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = degree[i] + degree[j];
                if (isConnected[i][j]) {
                    temp--;
                }
                maxDegree = Math.max(maxDegree, temp);
            }
        }

        return maxDegree;
    }
}
