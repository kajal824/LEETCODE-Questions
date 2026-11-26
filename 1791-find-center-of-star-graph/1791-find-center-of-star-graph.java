class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] connected = new int[n + 1];

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            connected[u]++;
            connected[v]++;
        }

        for (int i = 1; i <= n; i++) {
            if (connected[i] == edges.length) {
                return i;
            }
        }

        return -1;
    }
}
