// 2 + 7 == 9, return index of 2 and 7 i.e: [0,1]
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];

        for(int i=0; i<arr.length; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                ans[0] = map.get(complement);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = {2,7,11,15};
        int target = 9;

        int result[] = twoSum(arr,target);

        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}