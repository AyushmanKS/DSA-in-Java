public class FindDuplicate38 {
    
    // every number has a duplicate except one, find that one number
    public static int nonDuplicate(int nums[]) {
        int xor = 0;
        for(int i=0; i<nums.length; i++) {
            xor = xor ^ nums[i]; 
        }
        return xor;
    }
    
    // find two non duplicate numbers
    public static int twoNonDuplicate(int nums[]) {
        return 0;
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3,4,1,2,3};
        System.out.print("Output: "+nonDuplicate(nums));
    }    
}
