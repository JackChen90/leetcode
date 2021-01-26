package indi.jackie.leetcode.common;

/**
 * @author jackie chen
 * @create 2021/1/26
 * @description UnionFind
 */
public class UnionFind {
    private int[] parent;
    private int count;

    public UnionFind(int count) {
        this.parent = new int[count];
        for (int i = 0; i < count; i++) {
            this.parent[i] = i;
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void union(int x, int y) {
        int parentX = find(x);
        int parentY = find(y);
        if (parentX == parentY) {
            return;
        }
        parent[parentX] = parentY;
        count--;
    }

    private int find(int x) {
        while (x != parent[x]) {
            //改变parent, 减小深度
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
}
