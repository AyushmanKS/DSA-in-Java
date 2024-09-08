package ArraysPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// arr[i] + arr[j] + arr[k] == 0
public class ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            
            int j = i+1;
            int k = n-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];

                if(sum < 0) {
                    j++;
                }
                else if(sum > 0) {
                    k--;
                }
                else {
                    // this is when we get sum equal to 0
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    // avoid/skip duplicates
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
