
class TreeNode1 {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode1(int val) {
        value = val;
        left = null;
        right = null;
    }
}

public class DFS_trav {
    TreeNode root;

    public DFS_trav(int val) {
        root = new TreeNode(val);
    }

    // Recursive function for in-order DFS traversal
    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left); // Traverse left subtree
        System.out.print(node.value + " "); // Process current node
        inOrderTraversal(node.right); // Traverse right subtree
    }

    public void dfsInOrder() {
        inOrderTraversal(root);
    }

     private void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " "); // Process current node
        preOrderTraversal(node.left); // Traverse left subtree
        preOrderTraversal(node.right); // Traverse right subtree
    }

    public void dfsPreOrder() {
        preOrderTraversal(root);
    }

    private void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left); // Traverse left subtree
        postOrderTraversal(node.right); // Traverse right subtree
        System.out.print(node.value + " "); // Process current node

    }

    public void dfsPostOrder() {
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        DFS_trav tree = new DFS_trav(5);
        tree.root.left = new TreeNode(6);
        tree.root.right = new TreeNode(8);
        tree.root.left.left = new TreeNode(7);
        tree.root.left.right = new TreeNode(3);
        tree.root.left.right.right = new TreeNode(1);
        tree.root.right.left = new TreeNode(9);
        tree.root.right.right = new TreeNode(10);
        tree.root.right.right.right = new TreeNode(15);
        tree.root.right.right.right.left = new TreeNode(17);

        System.out.print("In-order DFS traversal: ");
        tree.dfsInOrder();
        System.out.println();

        System.out.print("Pre-order DFS traversal: ");
        tree.dfsPreOrder();
        System.out.println();

        System.out.print("Post-order DFS traversal: ");
        tree.dfsPostOrder();
        System.out.println();
    }
}


