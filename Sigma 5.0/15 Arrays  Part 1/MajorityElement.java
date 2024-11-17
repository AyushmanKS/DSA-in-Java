// Boyer-Moore Majority Voting Algorithm
public class MajorityElement {
    
    public static int majorityElement(int arr[]) {
        int majority = arr[0];
        int lead = 1;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] == majority) {
                lead++;
            }
            // case: when majority element != arr[i]
            else if(lead > 0) {
                lead--;
            }
            else {
                majority = arr[i];
            }
        }
        return majority;
    }
    public static void main(String args[]) {
        int nums[] = {3,2,3};
        System.out.print(majorityElement(nums));
    }
}
