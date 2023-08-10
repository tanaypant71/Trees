import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        value = val;
        left = null;
        right = null;
    }
}

public class BFS_trav {
    TreeNode root;

    public BFS_trav(int val) {
        root = new TreeNode(val);
    }

    public void bfstrav() {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>(); // Create a queue for BFS
        queue.offer(root); // Offer the root node to the queue

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll(); // Get the current node from the queue
            System.out.println(currentNode.value); // Process the current node

            // Offer the left and right child nodes to the queue if they exist
            if (currentNode.left != null)
                queue.offer(currentNode.left);
            if (currentNode.right != null)
                queue.offer(currentNode.right);
        }
    }

    public static void main(String[] args) {
        BFS_trav tree = new BFS_trav(1); // Create a tree with root value 1
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        tree.bfstrav(); // Perform BFS traversal
    }
}









