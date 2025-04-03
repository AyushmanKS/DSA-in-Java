public class FloodFill {

    void helper(int image[][], int sr, int sc, int color, int[][] visited, int orgColor) {
        if( sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || visited[sr][sc] == 1 || image[sr][sc] != orgColor) {
            return;
        }

        visited[sr][sc] = 1;

        image[sr][sc] = color;

        helper(image, sr, sc+1, color, visited, orgColor);
        helper(image, sr, sc-1, color, visited, orgColor);
        helper(image, sr+1, sc, color, visited, orgColor);
        helper(image, sr-1, sc, color, visited, orgColor);
    }

    void floodFill(int [][]image, int sr, int sc, int color) {
        int[][] visited = new int[image.length][image[0].length];

        FloodFill obj = new FloodFill();
        obj.helper(image, sr, sc, color, visited, image[sr][sc]);

        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int [][] image = { {1,1,1}, {1,1,0}, {1,0,1} };
        int sr = 1;
        int sc = 1;
        int color = 2;

        FloodFill obj = new FloodFill();
        obj.floodFill(image, sr, sc, color);
    }
}
