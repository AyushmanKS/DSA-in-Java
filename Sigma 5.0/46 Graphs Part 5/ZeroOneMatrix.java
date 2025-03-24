import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {

    static int[][] updateMatrix(int[][] mat) {
        final int[][] allDirections = {
            {-1,0}, 
            {1,0},
            {0,-1},
            {0,1},
        };

        int maxRow = mat.length;
        int maxCol = mat[0].length;

        int[][] dist = new int[maxRow][maxCol];

        final Queue<int[]> q = new LinkedList<>();

        for(int row=0; row<maxRow; row++) {
            for(int col=0; col<maxCol; col++) {
                if(mat[row][col] == 0) {
                    q.add(new int[]{row, col});
                    dist[row][col] = 0;
                }
                else {
                    dist[row][col] = 100000;
                }
            }
        }

        while(!q.isEmpty()) {
            final int[] pair = q.remove();

            final int currRow = pair[0];
            final int currCol = pair[1];

            for(final int[] dir: allDirections) {
                int targetRow = currRow + dir[0];
                int targetCol = currCol + dir[1];

                if(targetRow>=0 && targetCol>=0 && targetRow<maxRow && targetCol<maxCol) {
                    final int distance = dist[currRow][currCol] + 1;

                    if(dist[targetRow][targetCol] > distance) {
                        dist[targetRow][targetCol] = distance;
                        q.add(new int[]{targetRow, targetCol});
                    }
                }
            }
        }
        return dist;
    }
    public static void main(String args[]) {
        int matrix[][] = { {0,0,0}, {0,1,0}, {1,1,1}};

        int result[][] = updateMatrix(matrix);

        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
