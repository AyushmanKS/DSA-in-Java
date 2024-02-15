package Recursion;

public class lastOccurence7 {

    public static int lastOcc(int arr[], int k, int i) {
        if(arr.length == i) {
            return -1;
        }
        int isFound = lastOcc(arr, k, i+1);

        if(isFound == -1 && arr[i] == k) {
            return i;
        }
        return isFound; 
    }
    public static void main(String args[]) {
        int arr[] = {1,2,5,3,4,5,6};
        int key = 5;

        System.out.println("last occurence index: "+lastOcc(arr, key,0));
    }
} 
