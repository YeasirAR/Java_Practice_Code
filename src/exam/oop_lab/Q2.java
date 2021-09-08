package exam.oop_lab;
class Employees {
    public String name;
    public int age;
    public String office;
    private double salary;
    public Employees(String name, int age, String office,double salary){
        this.name = name;
        this.age= age;
        this.office = office;
        this.salary = salary;
    }
    public double tax_deduct(){
        double tax = salary*0.05;
        salary = salary -tax;
        return tax;
    }
    public double get_salary() {
        return salary;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employees e = new Employees("Jobayer",23,"XYZ",20000);
        System.out.println("Tax Amount: " + e.tax_deduct());
        System.out.println("Salary after tax deduct: "+e.get_salary());
    }

}
