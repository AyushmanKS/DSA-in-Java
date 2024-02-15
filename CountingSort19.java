public class CountingSort19 {
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        // interating through original array
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0; i<arr.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {5,8,2,3,0,9,6};

        CountingSort(arr);

        System.out.print("Sorted array using CountingSort: ");
        for(int i=0; i<arr.length;i++) {
            System.out.print(+arr[i]+" ");
        }
    }
}
