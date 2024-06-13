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
    public static int size;
 
    public void addFirst(int data) {
        // 1. creating new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void add(int idx, int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        // i == idx-1
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.add(2, 10);
        ll.print(); 
        System.out.println("Size of LinkedList: "+size);   
    }
}
