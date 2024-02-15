import java.util.*;
public class StringPalindrome24 {
        public static boolean Palindrome(String n) {

            for(int i=0; i<n.length()/2; i++) {
                if(n.charAt(i) != n.charAt(n.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            String n = sc.next();
            
            if(Palindrome(n)) {
                System.out.println("It is a Palindrome");
            }
            else {
                System.out.println("Not a Palindrome");
            }
            sc.close();
        } 
}
