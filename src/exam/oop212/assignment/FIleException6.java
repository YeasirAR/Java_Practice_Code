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
            while ((str=br.readLine()) != null){
                str = str.replaceAll("[^0-9.]","");
                System.out.println(str);

            }
//            String str;
//            char prev;
//            while ((str=br.readLine()) != null){
////                String[] temp = str.split(" ");
////                for(String s:temp){
////                    try {
////                        System.out.println(Double.parseDouble(s));
////                    }catch (Exception e){
////                        //
////                    }
////                }
//                for(char c:str.toCharArray()){
//                    if(Character.isDigit(c) || c=='.'){
//                        bw.write(c);
//                        prev = c;
//                    }
//                }
//                bw.write("\n");
//            }
//            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
