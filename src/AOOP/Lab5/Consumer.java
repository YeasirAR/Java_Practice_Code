package AOOP.Lab5;

public class Consumer implements Runnable {
    Q qObject;

    Consumer(Q qObject){
        this.qObject = qObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            int val = qObject.get();
            System.out.println("Value is: " + val);
        }
    }
}
