package test1;

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

    void Display() {
        System.out.println("Account Balance: " + balance);
    }

    void Withdraw(double withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println("Successfully Withdrawn TK " + withdraw);
        } else {
            System.out.println(" Withdraw Failed : not enough balance");
        }
    }
}
//    void acountdata(){
//        if(acc_type==1){
//            System.out.println("This is Savings Account");
//        }
//        if(acc_type==2){
//            System.out.println("This is Current Account");
//        }
//    }
//}

class CurrentAccount extends Account {
    void Penalty() {
        if (acc_type == 2 && balance > 200) {
            balance -= 20;
        }
        Display();
        //System.out.println("Account Balance :"+balance);
    }
}
class SavingAccount extends Account{
    void Interest(double interestRate, int year){
        balance=balance-((interestRate/100)*(year*12)*balance);
        Display();
    }
}
//    void cac(){
//        if(balance>200){
//            current = balance-withdraw;
//            System.out.println("This is current account and balance is " + current);
//        }
//
//    }
//}

//class Saving extends Account{
//    void sac(){
//        double savings= amount*(1+0.08/12)*(12*year)-amount;
//        System.out.println("This is the interest after" +year +"years" + savings);
//    }
//}

public class AccountTask {
    public static void main(String[] args) {
        Account ins = new Account();
        ins.Getdata("Dani Daniels","Kira Lee Orsag",1,500,100);
        ins.Withdraw(ins.amount);
        CurrentAccount ins2 = new CurrentAccount();
        ins2.Penalty();
        SavingAccount ins3 = new SavingAccount();
        ins3.Interest(4.5,2);
    }
}
//        Account obj=new Account(1);
//        Current obj1=new Current();
//        Saving obj2=new Saving();
//        obj.acountdata();
//        obj1.cac();
//        obj2.sac();
//    }
//}