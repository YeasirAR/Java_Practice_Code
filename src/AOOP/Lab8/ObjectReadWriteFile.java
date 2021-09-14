package AOOP.Lab8;

import java.io.*;
import java.util.ArrayList;

public class ObjectReadWriteFile {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1("Arif", 1010101, 5222.5);
        BankAccount1 b2 = new BankAccount1("Asif", 1013231, 5212.5);
        BankAccount1 b3 = new BankAccount1("Hasan", 10123101, 5322.5);

// Read write ArrayList

//        ArrayList<BankAccount1> accounts = new ArrayList<>();
//
//        accounts.add(b1);
//        accounts.add(b2);
//        accounts.add(b3);
//
//        try {
//            FileOutputStream f = new FileOutputStream("src/AOOP/Lab8/objectdata.txt");
//            ObjectOutputStream ow = new ObjectOutputStream(f);
//
//            ow.writeObject(accounts);
//
//            ow.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

// write ArrayList

        try {
            FileInputStream f = new FileInputStream("src/AOOP/Lab8/objectdata.txt");
            ObjectInputStream ow = new ObjectInputStream(f);

            ArrayList<BankAccount1> ac = (ArrayList<BankAccount1>)ow.readObject();

            System.out.println(ac.get(0).name + " " + ac.get(0).id);
            System.out.println(ac.get(1).name + " " + ac.get(1).id);
            System.out.println(ac.get(2).name + " " + ac.get(2).id);

            ow.close();
        }


// Read write single object

//        try {
//            FileOutputStream f = new FileOutputStream("Files/src/AOOP/Lab8/objectdata.txt");
//            ObjectOutputStream ow = new ObjectOutputStream(f);
//
//            ow.writeObject(bankAccount);
//
//            ow.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream f = new FileInputStream("src/AOOP/Lab8/objectdata.txt");
//            ObjectInputStream ow = new ObjectInputStream(f);
//
//            BankAccount b = (BankAccount)ow.readObject();
//
//            System.out.println(b.name + " " + b.id);
//
//            ow.close();
//        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


class BankAccount1 implements Serializable {
    String name;
    int id;
    double balance;

    public BankAccount1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
}
