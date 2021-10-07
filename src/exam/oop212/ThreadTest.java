package exam.oop212;

import java.util.Scanner;
class Test1 extends Thread{
    Test1(String name){
        super(name);
    }
    public void run(){
        String threadName = Thread.currentThread().getName();
        for(int i = 0; i < 10; i++){
            System.out.println(threadName + " " + i);
        }
    }
}

class Test2 implements Runnable{
    public void run(){
        String threadName = Thread.currentThread().getName();
        for(int i = 0; i < 10; i++){
            System.out.println(threadName + " " + i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Test1 t1 = new Test1("Thread 1");
        Test1 t2 = new Test1("Thread 2");
        Test1 t3 = new Test1("Thread 3");

        t1.start();
        t2.start();
        t3.start();

//        Thread t4 = new Thread(new Test2(), "Thread 4");
//        Thread t5 = new Thread(new Test2(), "Thread 5");
//        Thread t6 = new Thread(new Test2(), "Thread 6");
//
//        t4.start();
//        t5.start();
//        t6.start();

//        try {
//            t4.join();
//            t5.join();
//            t6.join();
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("How about this line?");
    }
}


//class Print_Before implements Runnable {
//    int N ;
//    public Print_Before(int N) {
//        this.N = N;
//    }
//    public void run() {
//        for(int i=1; i<=N/2; i++){
//            System.out.println(i);
//        }
//    }
//}
//
//class Print_After implements Runnable {
//    int N ;
//    public Print_After(int N) {
//        this.N = N;
//    }
//    public void run() {
//        for(int i=(N/2)+1; i<=N; i++){
//            System.out.println(i);
//        }
//    }
//}
//
//public class ThreadTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        Print_Before n1 = new Print_Before(num);
//        Print_After n2 = new Print_After(num);
//        Thread t1 = new Thread(n1);
//        Thread t2 = new Thread(n2);
//        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t2.start();
//
//    }
//}
