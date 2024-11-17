public class SubArrays {
    
    public static void subArrays(int arr[]) {
        int l = arr.length;
        int sum = 0;

        for(int i=0; i<l; i++) {
            for(int j=i+1; j<l; j++) {
                for(int k=i; k<=j; k++) {

                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                    
                }
                System.out.print("      Sum is:" + sum);
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
