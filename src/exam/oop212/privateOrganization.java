package exam.oop212;

abstract class Employee {
    public String name;
    public float salary;
    public Employee(String name,float salary){
        this.name = name;
        this.salary = salary;
    }
    public abstract void printSalary();
}
class PlatinumEmployee extends Employee{

    public PlatinumEmployee(String name, float salary) {
        super(name, salary);
    }
    public void printSalary(){
        System.out.println("Name: "+name);
        System.out.println("Bonus Amount: "+salary*0.15+"$");
        System.out.println("Total Salary: "+(salary+salary*0.15)+"$");

    }
}
class SilverEmployee extends Employee{

    public SilverEmployee(String name, float salary) {
        super(name, salary);
    }
    public void printSalary(){
        System.out.println("Name: "+name);
        System.out.println("Bonus Amount: "+salary*0.15+"$");
        System.out.println("Total Salary: "+(salary+salary*0.15)+"$");
    }
}
public class privateOrganization{
    public static void main(String[] args) {
        Employee e1 = new PlatinumEmployee("Jamie Arnold",650.5f);
        e1.printSalary();
        System.out.println("");
        Employee e2 = new SilverEmployee("Antonia Ford",460.0f);
        e2.printSalary();
    }
}
