import java.util.Scanner;

public class PerfectNumberSum {

    public static boolean isPerfect(int n) {
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static int sumOfPerfectNumbersInRange(int start, int stop) {
        int totalSum = 0;
        System.out.print("Perfect numbers in the range [" + start + ", " + stop + "]: ");
        for (int i = start; i <= stop; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                totalSum += i;
            }
        }
        System.out.println();
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter stop of the range: ");
        int stop = scanner.nextInt();

        int result = sumOfPerfectNumbersInRange(start, stop);
        System.out.println("Sum of all perfect numbers in the range [" + start + ", " + stop + "] is: " + result);

        scanner.close();
    }
}
