package exam.oop_lab;

class Test_x{
    private int salary;
    Test_x(int salary){
        this.salary = salary;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    int getSalary(){
        return salary;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Test_x x = new Test_x(50);
        System.out.println(x.getSalary());
        x.setSalary(40);
        System.out.println(x.getSalary());
    }
}
