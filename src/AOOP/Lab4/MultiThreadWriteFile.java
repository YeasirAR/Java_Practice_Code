package AOOP.Lab4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MultiThreadWriteFile implements Runnable {
    String fileName;
    MultiThreadWriteFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int j = 0; j < 1000000; j++) {
                writer.write(j + "\n");
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 10; i++){
            MultiThreadWriteFile m = new MultiThreadWriteFile("src/Files/mt"+i+".txt");
            Thread t = new Thread(m);
            threads.add(t);
        }
        for(Thread t: threads) t.start();
        for(Thread t: threads) t.join();

        long t2 = System.currentTimeMillis();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println("Time taken in ms: " + (t2 - t1));
    }
}
