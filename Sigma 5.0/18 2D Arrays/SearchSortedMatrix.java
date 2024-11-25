public class SearchSortedMatrix {
    
    public static boolean staircaseSearch(int arr[][], int key) {
        int row = 0; 
        int col = arr[0].length - 1;

        while(row < arr.length && col >= 0) {

            if(arr[row][col] == key) return true;
            
            else if(key < arr[row][col]) col--;
            
            else row++;
        }
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48}, 
                         {32,33,39,50}};
        int key = 33;
        System.out.println(staircaseSearch(matrix, key));
    }
}
