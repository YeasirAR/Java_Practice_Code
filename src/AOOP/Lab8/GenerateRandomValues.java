package AOOP.Lab8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateRandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        try{
            PrintWriter out = new PrintWriter("Files/data.txt");

            for(int i = 0; i < 500000; i++){
                out.println(random.nextInt(100000));
            }

            out.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}