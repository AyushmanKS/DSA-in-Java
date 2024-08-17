package ArraysPractice;
// rotate matrix by 90 deg
public class RotateMatrix {

    public static void rotate(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;

        // swapping row and col matrix elements to obtain transpose of matrix
        for(int i=0; i<r; i++) {
            for(int j=1; j<c; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reversing rows and columns of transposed matrix
        for(int i=0; i<r; i++) {
            for(int j=0; j<r/2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][r - 1 - j];
                matrix[i][r - 1 - j] = temp;
            }
        }
        // printing matrix
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
