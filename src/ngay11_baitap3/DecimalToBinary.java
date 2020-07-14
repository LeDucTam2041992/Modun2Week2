package ngay11_baitap3;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal : ");
        int decimal = scanner.nextInt();
        do {
            stack.push(decimal % 2);
            decimal /= 2;
        } while (decimal != 0);
        String result = "(";
        while (!stack.empty()) {
            result+=stack.pop();
        }
        result = result + ")B";
        System.out.println("The binary : " + result);
    }
}
