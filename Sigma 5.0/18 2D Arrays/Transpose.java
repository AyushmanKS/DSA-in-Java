public class Transpose {

    public static void transpose(int arr[][]) {
        int z[][] = new int[arr[0].length][arr.length]; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                z[j][i] = arr[i][j]; 
            }
        }

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[][] = { {1, 2, 3}, {4, 5, 6} };
        transpose(arr);
    }
}
