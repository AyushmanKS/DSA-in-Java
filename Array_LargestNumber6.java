public class Array_LargestNumber6 {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++) {

            // checking largest number
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            // checking smallest number
            if(smallest > numbers[i]) {
            smallest = numbers[i];
            }
        }
        System.out.println("Smallest number: "+smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {1,5,7,9,10,100};

       System.out.println("Largest number: "+largest(numbers)); 
    }    
}
