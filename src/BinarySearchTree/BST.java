package BinarySearchTree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current!=null) {
            if (e.compareTo(current.element) < 0) current = current.left;
            else if (e.compareTo(current.element) > 0) current = current.right;
            else return true;
        }
        return false;
    }

    @Override
    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        boolean isHas = false;
        while (current!=null && !isHas) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            }
            else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            }
            else isHas = true;
        }
        if (!isHas) return true;
        if (current.left == null)
            if (parent.left.element == e) {
                parent.left = current.right;
            } else parent.right = current.right;
        else
            if (current.right == null)
                if(parent.right.element == e) {
                    parent.right = current.left;
                } else parent.left = current.left;
        return  true;
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    @Override
    public void breathFirst() {
        breathFirst(root);
    }

    protected void breathFirst(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");

    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }
}
