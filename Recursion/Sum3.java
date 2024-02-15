package Recursion;

public class Sum3 {

    public static int Sum(int n) {
        if(n==0) {
            return 0;
        }
        return (n + Sum(n-1));
    }
    public static void main(String args[]) {
        int n= 5;
        System.out.println("Sum from "+n+" to 0: "+Sum(n));
    }
}
