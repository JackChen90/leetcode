package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/20
 * @description NumRookCaptures999
 */
public class NumRookCaptures999 {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('R' == board[i][j]) {
                    x = i;
                    y = j;
                }
            }
        }

        return catchSoilder(board, x, y);
    }

    private int catchSoilder(char[][] board, int x, int y) {
        int ans = 0;

        int n = board.length;
        int m = board[0].length;

        for (int i = x; i < n; i++) {
            if ('B' == board[i][y]) {
                break;
            }
            if ('p' == board[i][y]) {
                ans++;
                break;
            }
        }

        for (int i = x; i >= 0; i--) {
            if ('B' == board[i][y]) {
                break;
            }
            if ('p' == board[i][y]) {
                ans++;
                break;
            }
        }

        for (int i = y; i < m; i++) {
            if ('B' == board[x][i]) {
                break;
            }
            if ('p' == board[x][i]) {
                ans++;
                break;
            }
        }

        for (int i = y; i >= 0; i--) {
            if ('B' == board[x][i]) {
                break;
            }
            if ('p' == board[x][i]) {
                ans++;
                break;
            }
        }

        return ans;
    }
}
