package Recursion;

public class BinaryStrings12 {
    public static void BinStrings(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        BinStrings(n-1, 0, str+"0");
        if(lastPlace == 0) {
            BinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]) {
        BinStrings(3, 0, "");
    }
}
