package ArraysPractice;

import java.util.ArrayList;
import java.util.List;
/*Input : arr[] = [4, 3, 1, 5, 6]
Output : 11
Explanation : Subarrays with smallest and second smallest are:- [4, 3] smallest = 3,second smallest = 4
[4, 3, 1] smallest = 1, second smallest = 3
[4, 3, 1, 5] smallest = 1, second smallest = 3
[4, 3, 1, 5, 6] smallest = 1, second smallest = 3
[3, 1] smallest = 1, second smallest = 3
[3, 1, 5] smallest = 1, second smallest = 3
[3, 1, 5, 6] smallest = 1, second smallest = 3
[1, 5] smallest = 1, second smallest = 5
[1, 5, 6] smallest = 1, second smallest = 5
[5, 6] smallest = 5, second smallest = 6
Maximum sum among all above choices is, 5 + 6 = 11. */

public class PairWithMaxSum {
    public static int pairWithMaxSum(List<Integer> arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i =0; i<arr.size()-1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        System.out.println(pairWithMaxSum(arr));
    }
}
