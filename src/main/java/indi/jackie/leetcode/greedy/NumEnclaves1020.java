package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2022/2/12
 * @description NumEnclaves1020
 */
public class NumEnclaves1020 {
    private int m;
    private int n;

    private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private boolean[][] visited;

    public int numEnclaves(int[][] grid) {
        int result = 0;

        m = grid.length;
        n = grid[0].length;

        visited = new boolean[m][n];

        /*
        从四周的点开始执行dfs, 标记能进入的陆地
         */
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }

        for (int j = 1; j < n - 1; j++) {
            dfs(grid, 0, j);
            dfs(grid, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    result += 1;
                }
            }
        }
        return result;
    }

    public void dfs(int[][] grid, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        for (int[] dir : dirs) {
            dfs(grid, x + dir[0], y + dir[1]);
        }
    }
}
