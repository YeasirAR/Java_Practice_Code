package exam.OOP193;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/exam/OOP193/filex.txt");
        File file2 = new File("src/exam/OOP193/filey.txt");
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 5; i++) {
            employees.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
        }
        /*for(int i=0; i<5; i++){
            System.out.println(employees.get(i).ID + " "+ employees.get(i).salary+ " " + employees.get(i).name);
        }*/
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.salary - o1.salary);
            }
        });
        PrintWriter printWriter = new PrintWriter(file2);
        printWriter.println(employees.get(0).ID + " " + employees.get(0).name + " " + employees.get(0).salary);
        printWriter.close();
    }
}

class Employee {
    public int ID;
    public String name;
    public double salary;

    Employee(int a, String b, double c) {
        ID = a;
        name = b;
        salary = c;
    }

}
