public class Kadanes {
    
    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<arr.length; i++) {
            cs += arr[i];
            if(ms < cs) {
                ms = cs;
            }
            if(cs < 0) {
                cs = 0;
            }
        }
        System.out.print("Max Sub array sum is: "+ms);
    }
    public static void main(String args[]) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadanes(arr);
    }
}
