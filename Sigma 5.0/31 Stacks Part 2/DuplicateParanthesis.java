import java.util.Stack;

public class DuplicateParanthesis {
    
    public static boolean duplicateParanthesis(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ')') {
                int c = 0;
                while(!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    c++;
                }
                if(c<1) {
                    return true;
                }
                else {
                    // popped out opening pair
                    s.pop();
                }
            } 
            else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]) {
        String s = "((a+b))";
        System.out.println(duplicateParanthesis(s));
    }
}
