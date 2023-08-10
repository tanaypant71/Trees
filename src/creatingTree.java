class trees
{
    int val;
    trees left;
    trees right;

    public trees(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class creatingTree {
    trees root;
    public creatingTree(int val)
    {
        root = new trees(val);
    }

     void postOrder(trees root)
    {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);

        System.out.println(root.val+" ");
    }

    void postOrder()
    {
        postOrder(root);
    }

    public static void main(String[] args) {
        creatingTree tree = new creatingTree(1);
        tree.root.left = new trees(2);
        tree.root.right = new trees(3);
        tree.root.left.left = new trees(4);
        tree.root.left.right = new trees(5);

        tree.postOrder();
    }
}
