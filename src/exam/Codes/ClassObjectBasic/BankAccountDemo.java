package lecture1;

class BankAccount {
    String accountHolderName;
    long accountNo;
    int currentAmount;

    void debit(int amount) {
        currentAmount -= amount;
        System.out.println("Current Balance of " + accountHolderName + " with " + accountNo + " is " + currentAmount);
    }

    void credit(int amount) {
        currentAmount += amount;
        System.out.println("Current Balance of " + accountHolderName + " with " + accountNo + " is " + currentAmount);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountHolderName = "Rifat Shahriyar";
        bankAccount1.accountNo = 1111111111111L;
        bankAccount1.currentAmount = 150_000;

        bankAccount1.credit(10000);
        bankAccount1.debit(20000);
    }
}
