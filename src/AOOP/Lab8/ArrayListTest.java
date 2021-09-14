package AOOP.Lab8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Files/data.txt"));
            ArrayList<BankAccount1> accounts = new ArrayList<>();

            while (sc.hasNext()){
                BankAccount1 ac = new BankAccount1(sc.next(),
                        sc.nextInt(),
                        sc.nextDouble());

                accounts.add(ac);
            }

            // Descending sort, balance
            accounts.sort(new Comparator<BankAccount1>() {
                @Override
                public int compare(BankAccount1 o1, BankAccount1 o2) {
                    // for negative return, o1 goes before o2
                    // for positive return, o2 goes before o1
                    if(o1.balance > o2.balance) return -1;
                    return 1;
                }
            });

            PrintWriter out = new PrintWriter("Files/result.txt");

            for(BankAccount1 ac: accounts){
                out.println(ac.name + " " + ac.id + " " + ac.balance);
            }
            out.close();
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}


class BankAccount{
    String name;
    int id;
    double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
}