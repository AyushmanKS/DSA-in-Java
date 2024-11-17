public class ReverseArray {
    
    public static void reverseArray(int arr[]) {

        int i = 0;
        int j = arr.length-1;

        while(i < j) {
            // swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        } 

        for(int p=0; p<=arr.length-1; p++) {
            System.out.print(arr[p]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
    }
}
