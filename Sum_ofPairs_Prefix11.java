public class Sum_ofPairs_Prefix11 {

    public static void SumPrefix(int arr[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        // initialize prefix array
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate/ create prefix array
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int start = i;

            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = 0;

                // prefix formula
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+MaxSum);
    }

    public static void main(String args[]) {
        int numbers [] = {2,4,6,8,10,12,14,16,18,20};
        
        SumPrefix(numbers);
    }
}
