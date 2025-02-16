import java.util.*;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null) return zigzag;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverse = new Stack<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (flag) {
                    reverse.add(node.val);
                } else {
                    level.add(node.val);
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            flag = !flag;

            while (!reverse.isEmpty()) {
                level.add(reverse.pop());
            }

            zigzag.add(level);
        }
        return zigzag;
    }

    public static void main(String[] args) {
        // Constructing the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ZigZagTraversal solution = new ZigZagTraversal();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Printing the zigzag level order traversal
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
