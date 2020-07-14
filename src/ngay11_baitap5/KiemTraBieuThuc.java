package ngay11_baitap5;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        boolean isTrue = true;
        char left;
        System.out.println("Enter the string ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);

            if(sym == '(') {
                bStack.push(sym);
            }

            if(sym == ')')
                if (bStack.isEmpty()) {
                    isTrue = false;
                    break;
                }
                else {
                    left = bStack.pop();
                    if (sym == left) {
                        isTrue = false;
                        break;
                    }
                }
        }

        if(isTrue && bStack.isEmpty()) System.out.println("Well!");
        else System.out.println("???");
    }
}
