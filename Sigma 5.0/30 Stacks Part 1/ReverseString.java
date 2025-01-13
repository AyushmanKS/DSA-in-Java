import java.util.Stack;

public class ReverseString {
    
    public static void reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()) {
            sb.append(s.pop());
        }
        System.out.println("Reversed String:"+sb);
    }
    public static void main(String args[]) {
        String s = "Ayushman";
        System.out.println("Original String:"+s);
        reverseString(s);
    }
}
