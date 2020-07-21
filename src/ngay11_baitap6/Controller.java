package ngay11_baitap6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner sc;

    public void writeEmployeeToFile (String fileName, Employee emp) {
        openFileToWrite(fileName);
        printWriter.println(emp.getName() + "|" + emp.getGender() + "|" +
                emp.getBirthday());
        closeFileAfterWrite(fileName);
    }

//    public void clearAllData(String fileName){
//        openFileToWrite(fileName);
//        printWriter.flush();
//        closeFileAfterWrite(fileName);
//    }

    public void openFileToWrite(String fileName){
        try {
            File file = new File(fileName);
            if (!file.exists()) file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeFileAfterWrite(String fileNmae) {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> readEmployeeFromFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) file.createNewFile();
            sc = new Scanner(Paths.get(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Employee> employees = new ArrayList<>();
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            Employee employee = createEmployss(data);
            employees.add(employee);
        }

        try {
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    public Employee createEmployss(String data) {
        String[] datas = data.split("\\|");
        Employee employee = new Employee(datas[0],datas[1],datas[2]);
        return employee;
    }
}
