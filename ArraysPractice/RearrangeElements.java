package ArraysPractice;

public class RearrangeElements {
    
    public static int[] rearrangeArray(int[] nums) {

        int positiveIdx = 0; int negativeIdx = 1;
        int ans[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                ans[positiveIdx] = nums[i];
                positiveIdx += 2; 
            }
            if(nums[i] < 0) {
                ans[negativeIdx] = nums[i];
                negativeIdx += 2;
            }
        }
        return ans;
    }
    
    public static void main(String args[]) {
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray(arr));
    }
}
