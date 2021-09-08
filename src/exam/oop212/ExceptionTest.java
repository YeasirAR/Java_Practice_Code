package exam.oop212;
class BankAccount{
    double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double w) throws InsufficientBalException, NegativeDepositException {
        if(balance<w){
            throw new InsufficientBalException("Insufficient Balance");
        }
        if(w<0){
            throw new NegativeDepositException("Negative Balance");
        }
        balance = balance - w ;
    }
    public void deposit(double d) throws NegativeDepositException {
        if(d<0){
            throw new NegativeDepositException("Negative Balance");
        }
        else {
            balance = balance + d;
        }
    }
}
class InsufficientBalException extends Exception {
    InsufficientBalException(String str) {
        super(str);
    }
}
class NegativeDepositException extends Exception {
    NegativeDepositException(String str) {
        super(str);
    }
}


public class ExceptionTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(500);
        try {
            b.withdraw(100);
            b.withdraw(500);
            b.deposit(10);
            b.deposit(-5);
        } catch (InsufficientBalException e) {
            System.out.println(e.getMessage());
        } catch (NegativeDepositException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
