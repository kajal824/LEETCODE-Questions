class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (solve(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, String word, int i, int j, int ind) {
        if (ind == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(ind)) {
            return false;
        }

        char tem = board[i][j];
        board[i][j] = '-';

        boolean u = solve(board, word, i - 1, j, ind + 1);
        boolean d = solve(board, word, i + 1, j, ind + 1);
        boolean l = solve(board, word, i, j - 1, ind + 1);
        boolean r = solve(board, word, i, j + 1, ind + 1);

        board[i][j] = tem;

        return u || d || l || r;
    }
}
