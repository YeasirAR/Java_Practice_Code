package exam.OOP193;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

 class spring2019_File {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/numbers.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        FileWriter writer = new FileWriter("src/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        ArrayList<Integer> temp = new ArrayList<>();


        String str = bufferedReader.readLine();
        while (str != null) {
            String[] str2 = str.split(",");
            for (String s : str2) {
                temp.add(Integer.parseInt(s));
            }
            int max = temp.get(0);
            for(int i = 0; i<temp.size(); i++) {
                if(temp.get(i) > max) {
                    max = temp.get(i);
                }
            }
            str = bufferedReader.readLine();
            bufferedWriter.write(max + "");
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}