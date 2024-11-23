public class SecondRowSum {

    public static int secondRowSum(int arr[][]) {
        int sum = 0;
        for(int i=0; i<arr[1].length; i++) {
            sum+= arr[1][i];
        }
        return sum;
    }
    public static void main(String args[]) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(secondRowSum(nums));
    }
}
