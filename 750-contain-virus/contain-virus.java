class Solution {
    public int containVirus(int[][] isInfected) {
        int m = isInfected.length, n = isInfected[0].length;
        int totalWalls = 0;

        while (true) {
            List<Set<Integer>> regions = new ArrayList<>();
            List<Set<Integer>> threats = new ArrayList<>();
            List<Integer> wallsNeeded = new ArrayList<>();
            boolean[][] visited = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isInfected[i][j] == 1 && !visited[i][j]) {
                        Set<Integer> region = new HashSet<>();
                        Set<Integer> threat = new HashSet<>();
                        int[] walls = new int[1];
                        dfs(isInfected, visited, i, j, region, threat, walls);
                        regions.add(region);
                        threats.add(threat);
                        wallsNeeded.add(walls[0]);
                    }
                }
            }

            if (regions.isEmpty()) break;

            int mostThreatening = 0;
            for (int i = 0; i < threats.size(); i++) {
                if (threats.get(i).size() > threats.get(mostThreatening).size()) {
                    mostThreatening = i;
                }
            }

            totalWalls += wallsNeeded.get(mostThreatening);

            for (int i = 0; i < regions.size(); i++) {
                if (i == mostThreatening) {
                    for (int pos : regions.get(i)) {
                        int x = pos / n, y = pos % n;
                        isInfected[x][y] = -1;
                    }
                } else {
                    for (int pos : threats.get(i)) {
                        int x = pos / n, y = pos % n;
                        isInfected[x][y] = 1;
                    }
                }
            }
        }

        return totalWalls;
    }

    private void dfs(int[][] grid, boolean[][] visited, int x, int y, Set<Integer> region, Set<Integer> threat, int[] walls) {
        int m = grid.length, n = grid[0].length;
        int[] dirs = {-1, 0, 1, 0, -1};
        visited[x][y] = true;
        region.add(x * n + y);

        for (int d = 0; d < 4; d++) {
            int nx = x + dirs[d], ny = y + dirs[d + 1];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if (grid[nx][ny] == 0) {
                    threat.add(nx * n + ny);
                    walls[0]++;
                } else if (grid[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(grid, visited, nx, ny, region, threat, walls);
                }
            }
        }
    }

}