public class BinarySearch7 {
    
    public static int BinarySearch(int arr[], int key) {
        int start=0; int end=arr.length-1; 

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        } 
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2,6,8,10,69,80,112};
        int key = 112;

        System.out.print("Index of key: "+BinarySearch(arr, key)); 
    }
}
