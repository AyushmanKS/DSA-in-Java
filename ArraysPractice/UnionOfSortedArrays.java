package ArraysPractice;

import java.util.ArrayList;

public class UnionOfSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> union = new ArrayList<>();
        int i=0; int j = 0;

        while(i<n && j<m) {
            if(arr1[i] <= arr2[j]) {
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n) {
            if(union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<m) {
            if(union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String args[]) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,6,7};
        int n = 5;
        int m = 5;
        
        System.out.println(findUnion(arr1, arr2, n, m));
    }
}
