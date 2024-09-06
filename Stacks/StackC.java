package Stacks;

import java.util.Stack;
// push at bottom of the Stack
public class StackC {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        // printing stack
        System.out.println(s);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
