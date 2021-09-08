package exam.fall20;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FileTest {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("src/exam/fall20/file.txt");
        FileWriter file1 = new FileWriter("src/exam/fall20/file1.txt");
        FileWriter file2 = new FileWriter("src/exam/fall20/file2.txt");
        BufferedReader reader = new BufferedReader(file);
        BufferedWriter writer1 = new BufferedWriter(file1);
        BufferedWriter writer2 = new BufferedWriter(file2);
        String str = reader.readLine();
        ArrayList<sortList> list = new ArrayList<>();
        while (str != null) {
            String[] s = str.split(" ");
            int x = Integer.parseInt(s[2]);
            if (x > 10000) {
                writer1.write(str);
                writer1.newLine();
            }
            str = reader.readLine();
            list.add(new sortList(s[0],s[1],x));
        }
        writer1.close();
        list.sort(new SortByBalance());
        for(int i=0; i<list.size();i++){
            writer2.write(list.get(i).a + " " + list.get(i).b+ " "+list.get(i).c+"\n");
        }
        writer2.close();

    }

}
class sortList{
    String a,b;
    int c;
    public sortList(String a, String b, int c){
        this.a=a; this.b=b; this.c=c;
    }

}
class SortByBalance implements Comparator<sortList> {


    public int compare(sortList o1, sortList o2) {
        return o2.c-o1.c;
    }
}