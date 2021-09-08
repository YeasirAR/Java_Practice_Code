package AOOP.Lab5;

public class Main2 {
    public static void main(String[] args) {
        Q obj = new Q();
        Thread con = new Thread(new Consumer(obj), "Consumer");
        Thread pro = new Thread(new Producer(obj), "Producer");
        pro.start();
        con.start();
        try{
            con.join(); pro.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
