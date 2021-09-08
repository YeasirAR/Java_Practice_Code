package AOOP.Lab4;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SingleThreadWriteFile {
    SingleThreadWriteFile(){
        try {
            long t1 = System.currentTimeMillis();
            for(int i = 0; i < 10; i++){
                String fileName = "src/Files/st" + i + ".txt";
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                for(int j = 0; j < 1000000; j++){
                    writer.write(j + "\n");
                }
                writer.close();
            }
            long t2 = System.currentTimeMillis();

            System.out.println("Time taken in ms: " + (t2 - t1));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SingleThreadWriteFile();
    }
}
