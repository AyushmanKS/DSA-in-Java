public class powerof3_40 {
    public static boolean isPowerOfThree(int n) {

        long temp=1;
        
        while(n>1 && temp<n)
        {
            temp+=temp<<1;
            
        }
        
        return temp==n;
    }
    public static void main(String args[]) {
        System.out.println(isPowerOfThree(9));
    }
}
