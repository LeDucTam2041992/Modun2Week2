package ngay11_baitap2;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array : ");
        int numberOfArr = scanner.nextInt();
        int[] arr = new int[numberOfArr];
        for (int i = 0; i < numberOfArr; i++) {
            System.out.print("Enter element " + i + " = ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Array integer : ");
        for (int i = 0; i < numberOfArr; i++) {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < numberOfArr; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < numberOfArr; i++) {
            arr[i] = stack.pop();
        }
        System.out.println();
        System.out.println("New array : ");
        for (int i = 0; i < numberOfArr; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
