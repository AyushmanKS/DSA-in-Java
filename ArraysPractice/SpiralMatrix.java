package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

        public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiral = new ArrayList<>();
        
        int n = matrix.length; 
        int m = matrix[0].length; 
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++) 
                spiral.add(matrix[top][i]);

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                spiral.add(matrix[i][right]);

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    spiral.add(matrix[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiral.add(matrix[i][left]);

                left++;
            }
        }
        return spiral;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
