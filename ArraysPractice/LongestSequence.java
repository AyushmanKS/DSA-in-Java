package ArraysPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    
    public static int longestconsecutive(int arr[], int l) {
        if(l==0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // putting all array elements in set
        for(int i=0; i<l; i++) {
            set.add(arr[i]);
        }
        // traversing through set
        for(int e: set) {
            // checking is the element is first element
            if(!set.contains(e-1)) {
                int cnt = 1;
                int x = e;
                // if consecutive elements are present, increasing cnt and element
                while(set.contains(x+1)) {
                    cnt++;
                    x++;
                }
                // finding the longest sequence length
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
    public static void main(String args[]) {
        int arr[] = {100,4,200,1,3,2};
        int l = arr.length;
        System.out.println(longestconsecutive(arr, l));
    }
}
