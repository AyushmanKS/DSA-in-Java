public class Kadanes_Algo12 {

    public static void Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; // maximum sum
        int cs = 0; // current sum

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum SubArray sum using Kadane's algo: "+ms);
    }
    public static void main(String args[]) {
        //int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-1,-2,-3,-5,-9};

        Kadanes(arr);
    }
}
