// return index of upper bound
public class UpperBound {

    public static int upperBound(int arr[], int k) {
        int ans = -1;  
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > k) {
                ans = mid;        
                high = mid - 1; 
            } else {
                low = mid + 1;                }
        }
        return ans; 
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int target = 5;
        System.out.println(upperBound(arr, target));  
    }
}
