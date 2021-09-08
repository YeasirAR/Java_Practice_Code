package exam;

import java.io.*;

public class paakFileIO{
    public static void main(String[] args) throws IOException {
        int sum=0;
        FileReader reader = new FileReader("src/numbers.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        FileWriter writer = new FileWriter("src/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String str = bufferedReader.readLine();
        while (str != null){
            String[] str2 = str.split(",");
            for (String s:str2) {
                sum = sum+Integer.parseInt(s);
            }
            str = bufferedReader.readLine();
            bufferedWriter.write(sum+"");
            bufferedWriter.newLine();
            sum=0;

        }
        bufferedWriter.close();
    }

}