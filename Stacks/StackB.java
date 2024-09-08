package Stacks;

public class StackB {
    // implementing stack using LinkedList
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class StackLL {
        static Node head = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {

        StackLL.push(1);
        StackLL.push(2);
        StackLL.push(3);
        StackLL.push(4);

        while(!StackLL.isEmpty()) {
            System.out.println(StackLL.peek());
            StackLL.pop();
        }
    }
}
