package ngay10_thuchanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst("abc");// can add data String, float,..
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        ll.addFirst(arr);// can add data type array, obj...

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
