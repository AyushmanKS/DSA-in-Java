// merging using extra space
public class MergeSortedArrays {

    public static void mergeSorted(int arr1[], int m, int arr2[], int n) {
        int result[] = new int[m+n];
        int left = 0;
        int right = 0;
        int index = 0;

        while(left < m && right < n) {
            if(arr1[left] <= arr2[right]) {
                result[index] = arr1[left];
                index++; 
                left++;
            }
            else {
                result[index] = arr2[right];
                index++;
                right++;
            }
        }
        while(left < m) {
            result[index++] = arr1[left++];
        }
        while(right < n) {
            result[index++] = arr1[right++];
        }

        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr1[] = {1, 4, 8, 10};
        int m = 4;
        int arr2[] = {2, 3, 9};
        int n = 3;

        mergeSorted(arr1, m, arr2, n);
    }
}