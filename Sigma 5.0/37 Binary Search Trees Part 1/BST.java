class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) return false;
    
        if (root.data == key) return true;
    
        if (root.data > key) return search(root.left, key);
        
        return search(root.right, key); 
    }
    
    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static int closestElement(Node root, int K) {
        if (root == null) return -1;

        Node closest = root; 

        while (root != null) {

            if (root.data == K) return root.data;
            
            // Update closest if current node is closer to K
            if (Math.abs(root.data - K) < Math.abs(closest.data - K)) {
                closest = root;
            }

            // Move left if K is smaller, right if K is greater
            if (K < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return closest.data;
    }
    public static void main(String args[]) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        System.out.println("4 is present is binary search tree: "+ search(root, 4));

        System.out.println("Closest Element: "+closestElement(root, 0));
    }
}