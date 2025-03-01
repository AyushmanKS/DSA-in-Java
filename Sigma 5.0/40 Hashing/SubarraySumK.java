// find the number of subarrays whose sum equals k

import java.util.HashMap;

public class SubarraySumK {

    public static int countSubarrays(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        System.out.println("Number of subarrays whose sum is "+k+" are: "+countSubarrays(arr, k));
    }
}
