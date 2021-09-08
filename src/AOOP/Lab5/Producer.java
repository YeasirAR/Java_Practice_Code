package AOOP.Lab5;

public class Producer implements Runnable{
    Q qObject;

    Producer(Q qObject){
        this.qObject = qObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            qObject.put(i);
        }
    }
}
