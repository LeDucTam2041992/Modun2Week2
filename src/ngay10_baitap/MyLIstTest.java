package ngay10_baitap;

public class MyLIstTest {
    public static void main(String[] args) {
        MyList list = new MyList();
        for (int i = 0; i < 10; i++) {
            list.add(i,i);
        }
        System.out.println(list.size());
        System.out.println(list.contains(8));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(9));
        Object numb = list.remove(4);
        System.out.println(numb);
        System.out.println(list);
        list.clear();
        System.out.println(list.size());
    }
}
