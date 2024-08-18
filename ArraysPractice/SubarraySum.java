package ArraysPractice;
// return number of subarray whose sum equals K
public class SubarraySum {
    
    // brute force approach
    public static int subarraysum(int arr[],int k) {
        int cnt = 0;
        
        for(int i=0; i<arr.length;i++) {
            int sum =0;
            for(int j=i; j<arr.length;j++) {
                sum += arr[j];
                if(sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3};
        int k = 3;
        System.out.println(subarraysum(arr, k));
    }
}
