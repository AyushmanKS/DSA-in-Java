public class Sum_ofPairs10 {
    public static void PrintPairs(int arr[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            int start = i;

            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++) {
                    // subArray sum
                    currSum += arr[k];    
                }
                //System.out.println(currSum);
                if(MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+MaxSum);
    }
    public static void main(String args[]) {
        int numbers [] = {2,4,6,8,10,12,14,16,18,20};
        
        PrintPairs(numbers);
    }
} 
