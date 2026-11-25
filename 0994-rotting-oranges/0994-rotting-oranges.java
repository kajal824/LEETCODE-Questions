class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<org> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2 ) {
                    q.add(new org(i, j, 0));
                }
            }
        }

        org tr = null;

        while (!q.isEmpty()) {
            tr = q.poll();

            if (grid[tr.row][tr.col] == 10) {
                continue;
            }

            grid[tr.row][tr.col] = 10;

            solve( grid, tr.row - 1, tr.col, tr.time, q);
            solve( grid, tr.row + 1, tr.col, tr.time, q);
            solve(grid,tr.row, tr.col - 1, tr.time, q);
            solve(grid,tr.row, tr.col + 1, tr.time, q);

        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
         return (tr==null?0:tr.time);

    }

    public void solve(int grid[][], int row, int col, int time, Queue<org> q) {
        if (row >= grid.length || col < 0 || row < 0 || col >= grid[0].length || grid[row][col] == 10
                || grid[row][col] == 0 || grid[row][col]!=1) {
            return;
        }
        grid[row][col] = 2;
        q.add(new org(row, col, time + 1));
    }

}

class org {
    int row;
    int col;
    int time;

    org(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}