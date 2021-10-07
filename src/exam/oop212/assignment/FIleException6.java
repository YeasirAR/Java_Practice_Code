package exam.oop212.assignment;

import java.io.*;

public class FIleException6 {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader("src/exam/oop212/assignment/file1.txt");
            BufferedReader br = new BufferedReader(file1);
            FileWriter file2 = new FileWriter("src/exam/oop212/assignment/file2.txt");
            BufferedWriter bw = new BufferedWriter(file2);
            String str;
            while ((str=br.readLine()) != null) {     //read a line from the file in each iteration
                String[] temp = str.split(" "); //splitting the line based on space
                for (String s : temp) {               // iterate the splitted string
                    // replace all the character with empty string except 0 to 9 and dot(.)
                    s = s.replaceAll("[^0-9.]","");
                    // now the string can be three thing, Number/Empty String/Single dot(full stop of sentence)
                    // so when the string contains a number, then the condition will be true
                    if(!s.equals("") && !s.equals(".")) {
                        bw.write(s+" ");     // writing to file
                    }
                }
                bw.write("\n");  // writing to file
            }
            bw.close();  // close file / flash the content to file
            br.close();  // close reader
        } catch (FileNotFoundException e) {  // Catch exceptions
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
