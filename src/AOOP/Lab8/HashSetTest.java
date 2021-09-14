package AOOP.Lab8;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Files/data.txt"));
            int numCheck = 10051;

            HashSet<Integer> numbers = new HashSet<>();

            while(sc.hasNext()){
                int r = sc.nextInt();
                numbers.add(r);
            }

            if(numbers.contains(numCheck)){
                System.out.println("Found!");
            }
            else System.out.println("Not Found!");

            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
