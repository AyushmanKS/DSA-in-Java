public class DiagonalSum26 {
    public static int DiagonalSum(int [][]mat) {
        int sum=0;
        int l = mat.length;

        for(int i=0; i<l; i++) {
            // sum +=  primary diagonal element + secondary diagonal element
            sum += (mat[i][i] + mat[i][l-i-1]);
        }
        if(l%2 == 0) {
            return sum;
        }
        else {
            // center element of matrix
            return sum-mat[l/2][l/2];
        }
    }

    public static void main(String args[]) {
        int [][]matrix = {{2,0,2},
                          {0,2,0},
                          {2,0,2}};

        int ans = DiagonalSum(matrix);

        System.out.print(ans);
    }
}
