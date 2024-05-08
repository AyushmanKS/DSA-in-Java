package ArrayList;
// Subarray Sum Equals K
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.
public class SubArraySumK {
    
    static int subArraySum(int arr[], int k) {
        int c = 0;

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j= i; j<arr.length; j++) {
                sum += arr[j];

                if(sum == k) {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String args[]) {
        //int arr[] = {1,1,1};
        //int k = 2;
        int arr[] = {1,2,3};
        int k = 3;

        System.out.println(subArraySum(arr, k));
    }
}
