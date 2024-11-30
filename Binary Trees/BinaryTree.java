import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {}

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert root element
    public void populate(Scanner sc) {
        System.out.println("Enter root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    // Insert elements recursively
    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of: " + node.value + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter value of the left node of: " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of: " + node.value + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter value of the right node of: " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Display the tree
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
        sc.close();
    }
}
