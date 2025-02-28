import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MaximizeArray {
    
    static ArrayList<Integer> maximizeArray(int arr1[], int arr2[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // adding elements in pq from both arrays
        for(int i : arr1) pq.offer(i);
        for(int i : arr2) pq.offer(i);

        // adding elements in set from pq
        while(set.size() != n) set.add(pq.poll());

        // adding elements in ans list
        for(int i : arr2) {
            if(set.contains(i)) {
                ans.add(i);
                set.remove(i);
            }
        }
        for(int i : arr1) {
            if(set.contains(i)) {
                ans.add(i);
                set.remove(i);
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int n = 5;
        int []arr1 = {7, 4, 8, 0, 1};
        int []arr2 = {9, 7, 2, 3, 6};

        System.out.print(maximizeArray(arr1, arr2, n));
    }
}
