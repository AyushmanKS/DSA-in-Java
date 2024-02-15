package Recursion;

public class firstOccurence6 {

    public static int firstOcc(int arr[], int k, int i) {
        int l = arr.length;

        if(i == l) {
            return -1;
        }
        if(arr[i] == k) {
            return i;
        }
        return firstOcc(arr,k, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 3;
        System.out.println(firstOcc(arr, key, 0));
    }
}
