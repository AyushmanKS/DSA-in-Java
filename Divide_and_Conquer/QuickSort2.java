package Divide_and_Conquer;
public class QuickSort2 {
// print array function
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
// quick sort function    
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if(si>=ei) {
            return;
        }
        // last element
        int pivot_idx = partition(arr,si,ei);
        quickSort(arr, si, pivot_idx-1); // left
        quickSort(arr, pivot_idx+1, ei); // right
    }
// partition functon    
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;   // to make place fr elements smaller than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
          // swap
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp;
        return i;
    }
// main function    
    public static void main(String args[]) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
