package AOOP.Lab8;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Files/data.txt"));
            HashMap<String, Integer> map = new HashMap<>();

            while(sc.hasNext()){
                String st = sc.next();
                if(map.containsKey(st)){
                    int v = map.get(st);
                    map.put(st, v + 1);
                }
                else{
                    map.put(st, 1);
                }
            }

            for(int i = 0; i < 100000; i++){
                if(map.containsKey(i + ""))
                    System.out.println(i + " " + map.get(i + ""));
                else
                    System.out.println(i + " 0");
            }

            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
