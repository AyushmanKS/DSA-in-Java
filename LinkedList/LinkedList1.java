package LinkedList;

public class LinkedList1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail; 
 
    public void addFirst(int data) {
        // 1. creating new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        // 2. newNode next = head
        newNode.next = head;

        // 3. head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}
