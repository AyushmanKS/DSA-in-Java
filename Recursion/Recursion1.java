package Recursion;

public class Recursion1 {
    
    // 10 9 8 7 6 5 4 3 2 1
    public static void printDec(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    
    // 1 2 3 4 5 6 7 8 9 10
    public static void printInc(int n) {
        if(n==1) {
            System.out.print(n+" ");
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        printDec(10);
        printInc(10);
    }
}
