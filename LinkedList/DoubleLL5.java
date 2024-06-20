package LinkedList;

public class DoubleLL5 {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    

    public static void main(String args[]) {
        DoubleLL5 dll = new DoubleLL5();
    }
}
