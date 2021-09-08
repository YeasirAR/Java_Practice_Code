package exam.oop212;

import java.util.Scanner;

class Print_Before implements Runnable {
    int N ;
    public Print_Before(int N) {
        this.N = N;
    }
    public void run() {
        for(int i=1; i<=N/2; i++){
            System.out.println(i);
        }
    }
}

class Print_After implements Runnable {
    int N ;
    public Print_After(int N) {
        this.N = N;
    }
    public void run() {
        for(int i=(N/2)+1; i<=N; i++){
            System.out.println(i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print_Before n1 = new Print_Before(num);
        Print_After n2 = new Print_After(num);
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
