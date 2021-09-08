package AOOP;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name,int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void print() {
        System.out.println("Name: "+name+"\n"+"ID : "+id +"\n"+ "Salary :" + salary+"\n");
    }
    public void update(double salary){
        this.salary=salary;
    }

}

class Salaried extends Employee {

    public Salaried(String name,int id, double salary) {
        super(name,id, salary);
    }
    public void update(double salary){
        this.salary=salary;
    }
}

class HourlySalaried extends Employee {
    int hour;

   public HourlySalaried(String name, int id, double salary, int hour) {
        super(name, id, salary);
        this.hour = hour;
    }
    public void print() {
        System.out.println("Name: "+name+"\n"+"ID : "+id +"\n"+ "Salary :" + (salary*hour)+"\n");
   }
}

class Commissioned extends Employee {

    double commission;
    public Commissioned(String name, int id, double salary, double commission) {
        super(name, id, salary);
        this.commission = commission;
    }

    public void print() {
        System.out.println("Name: "+name+"\n"+"ID : "+id +"\n"+ "Salary :" + (salary+commission)+"\n");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Salaried("Jamie Arnold",402,5000);
        Employee e2 = new HourlySalaried("Antonia Ford",403,2000,9);
        Employee e3 = new Commissioned("Jessica Jung",403,8000,2000);
        e1.print();
        e2.print();
        e3.print();
        e1.update(6000);
        e2.update(1000);
        e3.update(5000);
        e1.print();
        e2.print();
        e3.print();

    }

}
