// Search in 2D Matrix - ||
public class Search {

    public static boolean searchMatrix(int [][]mat, int target) {
        int row = 0;
        int col = mat[0].length - 1;

        while(row < mat.length && col >= 0) {
            if(mat[row][col] == target) {
                return true;
            }
            else if(mat[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix, 5));
    }
}
