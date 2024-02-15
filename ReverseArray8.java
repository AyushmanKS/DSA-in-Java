public class ReverseArray8 {
    
    public static void Reverse(int arr[]) {
        int start=0; int end=arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {2,5,7,9,10,18,21,29,36,45,51,67,79,88,92,101};

        Reverse(arr);
    }
}
