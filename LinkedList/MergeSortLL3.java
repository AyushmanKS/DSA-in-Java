package LinkedList;

import java.util.LinkedList;

import LinkedList.LinkedList1.Node;

public class MergeSortLL3 {
    
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast !=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        } 
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // findind middle of ll
        Node mid = getMid(head);

        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merging left and right
        return merge(newLeft, newRight);
    }
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        
        System.out.println(ll);
    }
}
