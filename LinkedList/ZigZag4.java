package LinkedList;

import LinkedList.LinkedList1.Node;

public class ZigZag4 {
    
    public void zigZag() {
        // finding middle
        Node slow = LinkedList1.head;
        Node fast = LinkedList1.head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse the second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = LinkedList1.head;
        Node right = prev;
        Node nextL,nextR;

        // alt-merge: zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ZigZag4 zz = new ZigZag4();
        zz.zigZag();
        ll.print();
    }
}
