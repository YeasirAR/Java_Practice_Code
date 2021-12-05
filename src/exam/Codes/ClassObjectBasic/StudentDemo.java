package lecture1;
class Student {
    double CGPA;
    long ID;
    String name;

    void attendExam() {
        System.out.println(name + " is attending exam");
    }

    void attendOnline() {
        System.out.println(name + " is attending class");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student a = new Student();
        a.CGPA = 3.5;
        a.ID = 192181005L;
        a.name = "A";
        a.attendExam();
        a.attendOnline();
    }
}








// Create a class called BankAccount which has three properties: accountHolderName, accountNo, and currentAmount.
// This BankAccount class also has two functions: debit(int amount): void and credit(int amount): void
// when debit function is called, amount is subtracted from the currentAmount
// when credit function is called, amount is added to the currentAmount
