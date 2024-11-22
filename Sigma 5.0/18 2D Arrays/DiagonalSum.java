public class DiagonalSum {
    
    public static void diagonalSum(int matrix[][]) {
        int primary = 0;
        int secondary = 0;
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(i == j) {
        //             primary+=matrix[i][j];
        //         }
        //         if(i+j == matrix.length - 1) {
        //             secondary+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0; i<matrix.length; i++) {
            primary += matrix[i][i];
            secondary += matrix[i][matrix.length - i - 1];
        }
        System.out.println("Primary Diagonal Sum: "+primary);
        System.out.print("Secondary Diagonal Sum: "+secondary);
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum(matrix);
    }
}
