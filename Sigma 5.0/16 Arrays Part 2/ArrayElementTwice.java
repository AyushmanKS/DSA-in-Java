public class ArrayElementTwice {
    
    public static boolean isAppearingTwice(int arr[]) {
        int c = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    c++;
                }
            }
        }
        return c > 0;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,1};
        System.out.println(isAppearingTwice(arr));
    }    
}
