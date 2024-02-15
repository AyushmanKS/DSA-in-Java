// 2D array referred as matrix
import java.util.*;

public class Matrices20 {

    public static boolean Search(int matrix[][], int n, int m, int key) {
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == key) {
                    System.out.print("Index of key: "+"("+i+","+j+")");
                }
            }
        }
        
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        
        int n=matrix.length; 
        
        // first row, then its length= no. of columns 
        int m = matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        
        // input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        int key = 9;
        Search(matrix, n, m, key);
    }
}
