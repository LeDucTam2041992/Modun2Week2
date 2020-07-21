package BinarySearchTree;

public class Run {
    public static void main(String[] args) {
//        BST<String> tree = new BST<>();
//        tree.insert("George");
//        tree.insert("Michael");
//        tree.insert("Tom");
//        tree.insert("Adam");
//        tree.insert("Jones");
//        tree.insert("Peter");
//        tree.insert("Daniel");
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);


//        System.out.println("Inorder (sorted): ");
//        tree.inorder();
//        System.out.println("The number of nodes is: " + tree.getSize());
//        tree.postorder();
//        tree.preorder();
//        System.out.println(tree.search(69));
        tree.delete(67);
        tree.inorder();
    }
}
