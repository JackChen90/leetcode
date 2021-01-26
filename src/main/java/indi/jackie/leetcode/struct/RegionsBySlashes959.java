package indi.jackie.leetcode.struct;

import indi.jackie.leetcode.common.UnionFind;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2021/1/25
 * @description RegionsBySlashes959
 */
public class RegionsBySlashes959 {
    /**
     * 并查集思想, 每个1X1的方格, 根据对角线切分, 分为1-4 4个区域.
     * 每次根据入参中的划线/空格, 分别合并对应的区域.
     * 对于相邻的方格, 同样执行合并
     * 最终并查集的个数就是区域划分的结果
     *
     * @param grid 正方表格数据
     * @return 区域划分结果
     */
    public int regionsBySlashes(String[] grid) {
        if (Objects.isNull(grid) || grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int size = 4 * n * n;
        UnionFind unionFind = new UnionFind(size);
        for (int i = 0; i < n; i++) {
            char[] row = grid[i].toCharArray();
            for (int j = 0; j < n; j++) {
                if (row[j] == '/') {
                    unionFind.union(4 * (i * n + j), 4 * (i * n + j) + 1);
                    unionFind.union(4 * (i * n + j) + 2, 4 * (i * n + j) + 3);
                } else if (row[j] == '\\') {
                    unionFind.union(4 * (i * n + j), 4 * (i * n + j) + 3);
                    unionFind.union(4 * (i * n + j) + 1, 4 * (i * n + j) + 2);
                } else {
                    unionFind.union(4 * (i * n + j), 4 * (i * n + j) + 1);
                    unionFind.union(4 * (i * n + j) + 1, 4 * (i * n + j) + 2);
                    unionFind.union(4 * (i * n + j) + 2, 4 * (i * n + j) + 3);
                }
                //向右合并
                if (j < n - 1) {
                    unionFind.union(4 * (i * n + j) + 2, 4 * (i * n + j + 1));
                }
                //向下合并
                if (i < n - 1) {
                    unionFind.union(4 * (i * n + j) + 3, 4 * (i * n + n + j) + 1);
                }
            }
        }
        return unionFind.getCount();
    }
}
