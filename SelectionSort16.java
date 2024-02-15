public class SelectionSort16 {
    public static void SelectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
           // assuming current element to be minimum element's position
            int minPos = i;
            for(int j= i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5,8,2,3,0,-1,9,6};

        SelectionSort(arr);

        System.out.print("Sorted array using SelectionSort: ");
        for(int i=0; i<arr.length;i++) {
            System.out.print(+arr[i]+" ");
        }
    }
}
