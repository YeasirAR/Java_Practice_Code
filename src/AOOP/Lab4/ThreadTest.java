package AOOP.Lab4;


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
//        Test1 t1 = new Test1("Thread 1");
//        Test1 t2 = new Test1("Thread 2");
//        Test1 t3 = new Test1("Thread 3");
//
//        t1.start();
//        t2.start();
//        t3.start();

        Thread t4 = new Thread(new Test2(), "Thread 4");
        Thread t5 = new Thread(new Test2(), "Thread 5");
        Thread t6 = new Thread(new Test2(), "Thread 6");

        t4.start();
        t5.start();
        t6.start();

        try {
            t4.join();
            t5.join();
            t6.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("How about this line?");
    }
}
