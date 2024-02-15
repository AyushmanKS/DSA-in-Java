package Recursion;

public class AllOccurences13 {
    
    public static void occurences(int arr[],int k,int i) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == k) {
            System.out.print(i+" ");
            //occurences(arr, k, i+1);
        }
        occurences(arr, k, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {3,2,4,5,6,2,7,2,2};

        occurences(arr,2,0);
    }
}
