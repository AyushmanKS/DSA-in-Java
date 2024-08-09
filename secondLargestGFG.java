public class secondLargestGFG {

    public static int secondLargest(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE; 
            
        for(int i =0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        for (int i = 0;i < arr.length;i++) {
		if (arr[i] > second_large && arr[i] != max)
		    {
			second_large = arr[i];
		    }
	    }
        return second_large;
    }    
    public static void main(String args[]) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest element: "+secondLargest(arr));
    }
}