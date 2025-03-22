import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static int orangesRotting(int[][] grid) {
        int freshCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;  
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});  
                }
            }
        }

        if (freshCount == 0) return 0;

        int time = 0;

        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        // Start BFS to rot the fresh oranges
        while (!queue.isEmpty()) {
            int size = queue.size(); 

            // Process all rotten oranges in the current level
            for (int i = 0; i < size; i++) {
                int[] rottenLoc = queue.poll();
                int r = rottenLoc[0];
                int c = rottenLoc[1];

                // Check all four directions around the rotten orange
                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    // Skip if the new position is out of bounds or already rotten
                    if (nr < 0 || nr >= n || nc < 0 || nc >= m || grid[nr][nc] != 1) continue;
                    
                    // Turn the fresh orange into rotten and add it to the queue
                    grid[nr][nc] = 2;
                    freshCount--;  
                    queue.add(new int[]{nr, nc});

                    if (freshCount == 0) return time + 1;
                }
            }
            time++;
        }
        return freshCount == 0 ? time : -1;
    }

    public static void main(String args[]) {
        int grid[][] = {{2,1,1},{1,1,0},{1,0,1}};

        System.out.println(orangesRotting(grid));
    }
}