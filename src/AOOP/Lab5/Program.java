package AOOP.Lab5;


public class Program implements Runnable {
    final Printer printer;
    // Shared resource printer is passed using constructor.

    Program(Printer printer){
        this.printer = printer;
    }

    @Override
    public void run() {
        // synchronized will get a lock on the printer object. Once a thread gets a lock,
        // other threads will have to wait for that thread to finish.
        synchronized (printer) {
            System.out.println(printer.toString());
            printer.print1();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Printer printer = new Printer();
        // printer object is a shared resource. Multiple threads share this object.


        // Creating multiple threads with the shared resource.
        Thread t1 = new Thread(new Program(printer), "Program 1");
        Thread t2 = new Thread(new Program(printer), "Program 2");
        Thread t3 = new Thread(new Program(printer), "Program 3");

        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
