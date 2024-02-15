public class BubbleSort_fifteen {
    
    public static void BubbleSort(int arr[]) {

        for(int i = 0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } 

    public static void main(String args[]) {
        int arr[] = {5,8,2,3,0,-1,9,6};

        BubbleSort(arr);

        System.out.print("Sorted array using BubbleSort: ");
        for(int i=0; i<arr.length;i++) {
            System.out.print(+arr[i]+" ");
        }
    }
}
