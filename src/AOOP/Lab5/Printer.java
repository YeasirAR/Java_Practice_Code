package AOOP.Lab5;

public class Printer {
    // Different threads will call this method. But we don't
    // want a thread to switch once the thread starts this method.
    void print1(){
        for(int i = 0; i < 10; i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " " + i);
            try{
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
