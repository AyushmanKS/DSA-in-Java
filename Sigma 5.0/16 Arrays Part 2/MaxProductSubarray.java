// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }

    public static void main(String args[]) {
        MaxProductSubarray mps = new MaxProductSubarray();
        int nums [] = {2,3,-2,4};
        System.out.println(mps.maxProduct(nums));
    }
}
