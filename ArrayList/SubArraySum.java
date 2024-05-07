package ArrayList;

import java.util.ArrayList;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=0; int i=0; int j=0;
        
        if(s == 0) {
            for(int k = 0; k < n; k++) {
                if(arr[k] == 0) {
                    ans.add(k+1);
                    ans.add(k+1);
                    return ans;
                }
            }
            ans.add(-1);
            return ans;
        }
        
        while(j<n && i<=j) {
            while(j < n && sum < s) {
                sum += arr[j++];
            }
            while(i <= j && sum > s) {
                sum = sum - arr[i++];
            }
            if(sum == s) {
                if(i == 0 && j == 0) break;
                ans.add(i+1); // Adding 1 to make it one-based index
                ans.add(j);   // j doesn't need to be incremented as it's already pointing to the last element of the subarray
                break;
            }
        }
        if(ans.size() == 0) ans.add(-1);
        return ans;    
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,7,5};
        System.out.println(subarraySum(arr, 5, 12));
    }
}

