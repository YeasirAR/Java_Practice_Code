package exam.oop_lab;

import java.io.*;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader("src/MyFile.txt");
            FileWriter file2 = new FileWriter("src/MyFile2.txt",true);
            BufferedReader br = new BufferedReader(file1);
            BufferedWriter bw = new BufferedWriter(file2);
            Scanner sc = new Scanner(System.in);
            String str;
            while((str = br.readLine()) != null){
                bw.write(str+"\n");
                str = br.readLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
