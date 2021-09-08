class Account {
    String name, acc_name;
    int acc_type;
    double balance, amount;

    void Getdata(String name, String acc_name, int acc_type, double balance, double amount) {
        this.name = name;
        this.acc_name = acc_name;
        this.acc_type = acc_type;
        this.balance = balance;
        this.amount = amount;
    }

    void Display(String str) {
        System.out.println("Account Balance "+str+ " BDT " + balance);
    }

    void Withdraw(double withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println("Successfully Withdrawn BDT " + withdraw);
        } else {
            System.out.println(" Withdraw Failed : not enough balance");
        }
    }
}

class CurrentAccount extends Account {
    void Penalty() {
        if (acc_type == 2 && balance > 200) {
            balance -= 20;
        }
        Display("After Penalty:");
    }
}
class SavingAccount extends Account{
    void Interest(double interestRate, int year){
        balance=balance+((interestRate/100)*(year)*balance);
        Display("After Interest:");
    }
}


public class AccountTask {
    public static void main(String[] args) {
        CurrentAccount ins1 = new CurrentAccount();
        System.out.println("This is Current Account");
        ins1.Getdata("x","x",1,700,100);
        ins1.Withdraw(ins1.amount);
        ins1.Penalty();

        SavingAccount ins2 = new SavingAccount();
        System.out.println("\nThis is saving Account");
        ins2.Getdata("x","x",2,600,150);
        ins2.Withdraw(ins2.amount);
        ins2.Interest(4.5,2);
    }
}