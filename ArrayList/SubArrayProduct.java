package ArrayList;

public class SubArrayProduct {

    public static long countSubArrayProduct(long arr[], int n, long k)
    {
        if(k <= 1) {
            return 0;
        }
        long product = 1;
        int i = 0; 
        int j = 0; 
        long c = 0; 
        
        while(j < n) {
            product = product * arr[j];
            
            while(product >= k) {
                product = product / arr[i];
                i++;
            }
            
            c = c + (j - i + 1); 
            j++;
        }
        return c;
    }

    public static void main(String args[]) {
        int n=4; int k=10;
        long arr[] = {1,2,3,4};

        System.out.println(countSubArrayProduct(arr, n, k));
    }
}
