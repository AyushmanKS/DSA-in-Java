public class CountElement {

    public static int countElement(int arr[][], int key) {
        int c = 0;
        for(int i=0;i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(key == arr[i][j]) {
                    System.out.println(arr[i][j]);
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String args[]) {
        int arr[][] = {{4,7,8},{8,8,7}};
        // count the array contains how many '7'
        System.out.println(countElement(arr, 7));
    }
}
