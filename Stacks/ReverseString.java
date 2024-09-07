package Stacks;

import java.util.Stack;

// reverse string using stack
public class ReverseString {
    
    public static void reverseString(String str) {
        
        Stack<Character> s = new Stack<>();
        
        // pushing characters into stack
        for(int i=0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }
        // pop elements out of stack and store in result
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            System.out.println(curr);
            result.append(curr);
        }
        System.out.print(result);
    }
    public static void main(String args[]) {
        reverseString("abcdef");
    }
}
