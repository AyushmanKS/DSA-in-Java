public class powerof4_39 {

    public static boolean isPowerOfFrour(int n) {
        if( n>0 && ( (n & (n-1) )==0) ) {
        if( (n-1) % 3 ==0) {
            return true;
        }
    }
    return false;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfFrour(16));
    }
}