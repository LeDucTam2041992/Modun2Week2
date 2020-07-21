package ngay11_baitap6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        final String fileInput = "Employee.txt";
        final String fileOutput = "Result.txt";
        ArrayList<Employee> employees = new ArrayList<>();
        Queue<Employee> female = new LinkedList<>();
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> non = new LinkedList<>();
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------------Menu------------");
            System.out.println("1. Print all employees from file : ");
            System.out.println("2. Add new employee !");
            System.out.println("3. Collection employee ! ");
            System.out.println("0. Exit! ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    employees = controller.readEmployeeFromFile(fileInput);
                    for (Employee e: employees) {
                        System.out.println(e);
                    }
                    break;
                case 2 :
                    System.out.println("Enter employee name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter employee gender : ");
                    String gender = sc.nextLine();
                    System.out.println("Enter employee birthday : ");
                    String birthday = sc.nextLine();
                    Employee employee = new Employee(name,gender,birthday);
                    controller.writeEmployeeToFile(fileInput,employee);
                    break;
                case 3 :
                    employees = controller.readEmployeeFromFile(fileInput);
                    for (Employee s: employees) {
                        String gen = s.getGender();
                        if (gen.equals("male")) {
                            male.add(s);
                        } else if (gen.equals("female")) {
                            female.add(s);
                        } else {
                            non.add(s);
                        }
                    }
//                    controller.clearAllData(fileOutput);
                    for (Employee s:non) {
                        controller.writeEmployeeToFile(fileOutput,s);
                    }
                    for (Employee s:female) {
                        controller.writeEmployeeToFile(fileOutput,s);
                    }
                    for (Employee s:male) {
                        controller.writeEmployeeToFile(fileOutput,s);
                    }

                    employees = controller.readEmployeeFromFile(fileOutput);
                    for (Employee s:employees) {
                        System.out.println(s);
                    }
                    break;
            }
        } while (choice!=0);
    }
}
