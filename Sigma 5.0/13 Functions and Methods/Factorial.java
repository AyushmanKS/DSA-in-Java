public class Factorial {

    public static int giveFactorial(int n) {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println("Factorial: " + giveFactorial(n));
    }
}
