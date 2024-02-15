public class InsertionSort17 {
    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            // finding best position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr; 
        }        
    }
    public static void main(String args[]) {
        int arr[] = {5,8,2,3,0,-1,9,6};

        InsertionSort(arr);

        System.out.print("Sorted array using SelectionSort: ");
        for(int i=0; i<arr.length;i++) {
            System.out.print(+arr[i]+" ");
        }
    }
}
