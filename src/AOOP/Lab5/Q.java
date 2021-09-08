package AOOP.Lab5;

public class Q {
    int num;
    boolean flag = false;
    // flag true means there is a new value
    // flag false means, consumer received the value, or no value was set

    synchronized void put(int num){
        // put will wait until the flag becomes false,
        // that is until the consumer receives the previous value
        while(flag){
            try{
                wait(); // puts the current thread in sleep, until another thread wakes it up
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        this.num = num;
        flag = true;
        notify();  // Wakes up a single thread that is waiting on this object's monitor.
    }

    synchronized int get(){
        // get will wait until the flag becomes true,
        // that is until the producer puts a new value
        while(!flag){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        flag = false;
        int ret = num;
        notify();
        return ret;
    }
}