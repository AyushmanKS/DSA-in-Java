package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    static List<String> possiblePaths = new ArrayList<>();
    static String path = "";

    // isSafe method
    public static boolean isSafe(int row, int col, int m[][], int l) {
        if(row <= -1 || row >= l || col <= -1 || col >= l || m[row][col] == 0) {
            return false;
        } 
        return true;
    }
    // printPathHelper method
    public static void printPathHelper(int row, int col, int m[][], int l) {
        if(row == l-1 && col == l-1) {
            possiblePaths.add(path);
            return;
        }

    if(isSafe(row, col, m, l)) {
        path += 'D';
        printPathHelper(row+1, col, m, l);
        path = path.substring(0,path.length()-1);
        path += 'R';
        printPathHelper(row, col+1, m, l);
        path = path.substring(0, path.length()-1);
        }    
    }
    public static void main(String args[]) {
        int maze[][] = {{1,0,0,0},
                        {1,1,0,0},
                        {1,1,1,0},
                        {0,0,1,1}};
        int l = maze.length;
        
        printPathHelper(0,0,maze,l);

        for(int i=0; i<possiblePaths.size(); i++) {
            System.out.print(possiblePaths.get(i)+" ");
        }
    }
}
