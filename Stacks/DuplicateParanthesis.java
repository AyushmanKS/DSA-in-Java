package Stacks;

import java.util.Stack;

public class DuplicateParanthesis {
    
    public static boolean duplicateParanthesis(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if(ch == ')') {
                int count  = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; // duplicates case
                }
                else {
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
        //String s1 = "((a+b))";
        String s2 = "(a+b)";

        System.out.println(duplicateParanthesis(s2));
    }
}
