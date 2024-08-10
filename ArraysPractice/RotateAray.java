package ArraysPractice;
//rotating arrray by k elements to left using rever aproach

public class RotateAray {
    
    public static void reverse(int arr[], int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateToLeft(int arr[], int k) {
        int l = arr.length;
        // reversing first k elements
        reverse(arr, 0, k-1);
        // reversing last l-k elements
        reverse(arr, k, l-1);
        // reversing whole aray
        reverse(arr, 0, l-1);
    }

    public static void rotateToRight(int arr[], int k) {
        int l = arr.length;
        // reversing first l-k elements
        reverse(arr, 0, l-k-1);
        // reversing last l-k elements
        reverse(arr, l-k, l-1);
        // reversing whole aray
        reverse(arr, 0, l-1);
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7};
        int l = arr.length;
        int k=2;
        k = k % l;
        
        //rotateToLeft(arr, 2);
        rotateToRight(arr, k);

        System.out.print("After Rotating the k elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
