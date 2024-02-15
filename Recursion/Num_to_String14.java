package Recursion;
// 1947 -> one nine four seven
public class Num_to_String14 {

    static String map[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printString(int n) {
        // base case
        if(n==0) {
            return;
        }
        // actual work 
        int lastDigit = n % 10;
        printString(n / 10);
        System.out.print(map[lastDigit]+" ");
    }
    public static void main(String args[]) {    
        printString(1947);
    }
}
