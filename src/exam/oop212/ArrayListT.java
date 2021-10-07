package exam.oop212;

import java.io.*;
import java.util.*;

class BankAccount1 implements Comparable<BankAccount1> {
    String name;
    String id;
    int amount;

    public BankAccount1(String name, String id, int amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount1 that = (BankAccount1) o;
        return amount == that.amount && Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }
    @Override
    public int compareTo(BankAccount1 o) {
        String n1 = this.name;
        String n2 = o.name;
//        return this.amount-o.amount;

        return n2.compareTo(n1);

        // returns negative: this object goes before o object
        // returns positive: o object goes before this object
        // returns 0: this object and o object are same.
    }

}
class Manager1{
    public static void main(String[] args) {
        ArrayList<BankAccount1> list = new ArrayList<>();
        try {
            Scanner sc=  new Scanner(new FileReader("src/exam/oop212/data.txt"));
            BufferedWriter writer1 =  new BufferedWriter(new FileWriter("src/exam/oop212/data1.txt"));
            BufferedWriter writer2 =  new BufferedWriter(new FileWriter("src/exam/oop212/data2.txt"));
            while (sc.hasNext()){
                String name = sc.next();
                String id = sc.next();
                int amount  = sc.nextInt();
                list.add(new BankAccount1(name,id,amount));
                if(amount>10000){
                    writer1.write(name+" "+ id + " "+ amount);
                    writer1.newLine();
                }
            }
//            Collections.sort(list);
            list.sort(new Comparator<BankAccount1>() {
                @Override
                public int compare(BankAccount1 o1, BankAccount1 o2) {
//                    if(o1.amount<o2.amount)
//                        return 1;
//                    if (o2.amount<o1.amount)
//                        return -1;
//                    return 0;
                    return o2.amount-o1.amount;
                }
            });
            for (BankAccount1 b: list){
                writer2.write(b.name+" "+b.id+" "+ b.amount+"\n");
            }
            sc.close();
            writer1.close();
            writer2.close();
            //
            if(list.contains(new BankAccount1("Yeasir","ID223",50000))){
                System.out.println("Found");
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}



//public class ArrayListT {
//    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("5");
//        arr.add("6");
//        arr.add("2");
//        arr.add("1");
////        System.out.println(arr.get(2));
////        Collections.reverse(arr);
////        Collections.sort(arr);
////        arr.sort(Collections.reverseOrder());
////        System.out.println(arr);
//       Collections.sort(arr,new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(arr);
//    }
//}
