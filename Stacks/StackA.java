package Stacks;

import java.util.ArrayList;

// implementing stack using arrayList
public class StackA {
    static class StackArrayList {
        static ArrayList<Integer> list = new ArrayList<>();
        
        // is no element return true
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        // push
        public static void push(int data) {
            list.add(data);
        }
        // pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        } 
    }
    public static void main(String args[]) {

        StackArrayList.push(1);
        StackArrayList.push(2);
        StackArrayList.push(3);
        StackArrayList.push(4);

        while(!StackArrayList.isEmpty()) {
            System.out.println(StackArrayList.peek());
            StackArrayList.pop();
        }
    }
    
}
