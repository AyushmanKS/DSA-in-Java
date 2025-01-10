public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int data, int idx) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i< idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("LL is empty");
        } 
        head = head.next;
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthNodefromEnd(int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        // removing first node/head
        if(n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next  = prev.next.next;
        return;
    }

    public boolean detectCycle() {
        if(head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            } 
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean exists = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                exists = true;
                break;
            }
        }
        if(exists == false) {
            return;
        }

        slow = head;
        Node prev = null;
        
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static Node evenOddOrder(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next; 
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public Node addOne(Node head) {
        // code here.
        int val = head.data;

        for(Node temp = head.next; temp != null; temp = temp.next) {
            val = (val * 10)+temp.data;   
        }
        val+=1;
        
        Node newHead = new Node(val % 10);
        val /= 10;
        
        Node current = newHead;
        
        // converting updated value to LL
        while (val > 0) {
            Node newNode = new Node(val % 10);
            newNode.next = current;
            current = newNode;
            val /= 10;
        }
        return current;
    }
    
    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;
        
        Node pointerA = headA;
        Node pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }
        return pointerA;
    }
    
    public void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.add(0, 2);

        ll.printLL();
        //ll.removeFirst();
        ll.reverseLL();
        ll.printLL();
    }    
}