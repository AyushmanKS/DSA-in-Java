public class LargestNumber {
    
    public static void largestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]) {
        int arr[] = {9,6,0,15,99};
        largestNumber(arr);
    }
}