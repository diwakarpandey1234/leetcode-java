import java.util.*;

class Solution {

    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        int cnt = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] != 0 && !vis[i][j]) {

                    long sum = 0;
                    Stack<int[]> st = new Stack<>();

                    st.push(new int[]{i, j});
                    vis[i][j] = true;

                    while (!st.isEmpty()) {
                        int[] cell = st.pop();

                        int r = cell[0];
                        int c = cell[1];

                        sum += grid[r][c];

                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];

                            if (nr >= 0 && nr < n &&
                                nc >= 0 && nc < m &&
                                grid[nr][nc] != 0 &&
                                !vis[nr][nc]) {

                                vis[nr][nc] = true;
                                st.push(new int[]{nr, nc});
                            }
                        }
                    }

                    if (sum % k == 0) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}