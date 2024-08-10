package ArraysPractice;

import java.util.ArrayList;

public class moveZeros {
    // using counter approach
    public static void moveZeroes(int[] nums) {

        int count=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                count++;
            }
            else if(count>0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - count] = t;
            }
        }
    }

    public void moveZeroesToEnd(int[] a) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = a.length;

        for(int i=0; i<n; i++) {
            if(a[i] != 0) {
                temp.add(a[i]);
            }
        }
        int non_zero = temp.size();

        // filling non_zero elements in array
        for(int i=0; i<non_zero; i++) {
            a[i] = temp.get(i);
        }
        // filling zero elements in aray
        for(int i=non_zero; i<n; i++) {
            a[i] = 0;
        }
    }
    public static void main(String args[]) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
