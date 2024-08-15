package ArraysPractice;

// finding MaxSubArray sum 
public class Kadanes {
    
    public static int kadanes(int arr[]) {
        int max = Integer.MIN_VALUE;
        int l = arr.length;
        int sum = 0;

        for(int i=0; i<l; i++) {
            sum+= arr[i];

            max = Math.max(max, sum);

            if(sum > 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static int maxSubArraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int l = arr.length;

        for(int i=0; i<l; i++) {
            int sum = 0;
            for(int j= i; j<l; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int maximumSubArray(int arr[]) {
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }
    public static void main(String args[]) {
        //int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[] = {1,1,5,5};
        System.out.println("Max Subarray Sum is: "+maxSubArraySum(arr));
        System.out.println("Max Subarray Sum is: "+maximumSubArray(arr));
        System.out.println("(Kadanes only for negative elements)Max Subarray Sum is: "+kadanes(arr));
    }
}
