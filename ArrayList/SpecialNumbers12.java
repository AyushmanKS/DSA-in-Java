package ArrayList;

public class SpecialNumbers12 {

    static public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] % 2) == (nums[i + 1] % 2)) {
                return false;
            }
        }
        return true;
    }

    static boolean isSpecialNumber(int nums[]) {
        if(nums.length <=1) {
            return true;
        }
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] % 2 ==0) {
                if((nums[i-1] % 2 != 0) && nums[i+1] % 2 != 0) {
                    return true;
                }
            }
            else if(nums[i] % 2 != 0) {
                    if((nums[i-1] % 2 == 0) && nums[i+1] % 2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int nums[] = {2,1,4};
        //int nums[] = {4,3,1,6};
        System.out.println(isSpecialNumber(nums));
        System.out.println(isArraySpecial(nums));
    }
}
