public class Height {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int diameter(Node root) {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int ld = height(root.left);
        int rd = height(root.right);

        int selfDiameter = lh + rh + 1;
        return Math.max(selfDiameter, Math.max(ld, rd));        
    }

    public static int countNodes(Node root) {
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String args[]) {
        /*          1
                2       3
              4   5   6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree is: "+height(root));
        System.out.println("Number od nodes are: "+countNodes(root));
        System.out.println("diameter of tree is: "+diameter(root));
    }
}
