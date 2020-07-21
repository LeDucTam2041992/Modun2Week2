package BinarySearchTree;

public interface Tree<E> {
    public boolean insert(E e);

    public boolean search(E e);

    public boolean delete(E e);

    public void inorder();

    public void postorder();

    public void preorder();

    public void breathFirst();

    public int getSize();
}
