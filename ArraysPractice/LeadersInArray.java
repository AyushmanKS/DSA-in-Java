package ArraysPractice;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    // brute force solution    
    public static ArrayList<Integer> leaders1 (int n, int arr[]) {
        ArrayList<Integer> lead = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            boolean isLeader = true;
            for(int j=i+1; j<n; j++) {
                if(arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader) lead.add(arr[i]);
        }

        return lead;
    }
    // optimized solution
    public static ArrayList<Integer> leaders2 (int n, int arr[]) {
        ArrayList<Integer> lead = new ArrayList<>();
        int max = n-1;
        lead.add(arr[n-1]);
        
        for(int i = n-2; i>=0; i--) {
            if(arr[i] >= max) {
                lead.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(lead);
        return lead;
    }
    public static void main(String args[]) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        System.out.println(leaders1(n, arr));
        System.out.println(leaders2(n, arr));
    }
}
