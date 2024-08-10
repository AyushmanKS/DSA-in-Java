package ArraysPractice;

public class MissingNumber {
    public static int missingNumber(int arr[]) {
        int l=arr.length;

        for(int i=0; i<=l; i++) {
            int flag = 0;

            for(int j=0; j < l; j++) {
                if(arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }

    public static int missingNumXOR(int arr[]) {
        int mn = arr.length;

        for(int i =0; i < arr.length; i++) {
            mn = arr[i] ^ i ^ mn;
        }
        return mn;
    }
    public static void main(String args[]) {
        int arr[] = {3,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumXOR(arr));
    }
}
