package ngay11_baitap4;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean isPalindrome = true;
        System.out.println("Enter the string : ");
        String s = scanner.nextLine().toLowerCase();
//        s =s.replaceAll("\\s+","");
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            queue.add(s.charAt(i));
        }
        System.out.println(stack);
        System.out.println(queue);
        while (!stack.empty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(stack.isEmpty());
        if(isPalindrome) System.out.println("String is a palindrome!");
        else System.out.println("String is not a palindrome!");
    }
}
