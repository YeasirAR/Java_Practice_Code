package exam.Summer21;

import java.io.*;

class IO{
    public void read_print(){
        try {
            FileReader file = new FileReader("src/exam/Summer21/data.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String str = bufferedReader.readLine();
            while(str != null){
                System.out.println(str);
                str = bufferedReader.readLine();
            }
        }
        catch (FileNotFoundException e1){
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

}


public class IO_Test {
    public static void main(String[] args) {
        IO n = new IO();
        n.read_print();

    }
}
