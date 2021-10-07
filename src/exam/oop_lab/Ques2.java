package exam.oop_lab;
class X implements Runnable{

    public void run(){
        String threadName = Thread.currentThread().getName();
        for(int i = 1; i <= 4; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i!=4) {
                System.out.println(threadName + " has finished " + i + " burgers");
            }
            if(i==4){
                System.out.println("X has finished first");
            }
        }
    }
}

class Y implements Runnable{
    public void run(){
        String threadName = Thread.currentThread().getName();
        for(int i = 1; i <= 4; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i!=4) {
                System.out.println(threadName + " has finished " + i + " burgers");
            }

            if(i==4){
                System.out.println("Y has finished first");
            }
        }
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new X(), "X");
        Thread t2 = new Thread(new Y(), "Y");

        t1.start();
        t2.start();

    }

}
