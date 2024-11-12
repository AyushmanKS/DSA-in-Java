public class Palindrome {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int r = 0;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome(121));
    }
}
