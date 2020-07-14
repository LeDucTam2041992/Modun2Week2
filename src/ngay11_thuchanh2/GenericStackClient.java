package ngay11_thuchanh2;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<Integer> st = new MyGenericStack<>();
        System.out.println("1. Stack of integers");
        st.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        st.stackOfIStrings();
    }
}
