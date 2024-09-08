package Stacks;

import java.util.Stack;
// The next greater element of some element x in an array is the first greater
// element that is to the right of x in the same array.
// ip: [6,8,0,1,3]
// op: [8,-1,1,3,-1]

public class NextGreater {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // if element is smaller then pop from stack
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            // if stack is empty no grater elemen exists, therefore put -1
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                // remaining the greater element case
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
