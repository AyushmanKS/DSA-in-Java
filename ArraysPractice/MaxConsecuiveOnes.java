package ArraysPractice;

public class MaxConsecuiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                c++;
                max = Math.max(max,c);
            }
            else {
                c = 0;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int arr[] = {1,1,0,0,0,0,1,1,1,1,1,1,6,5,3,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
