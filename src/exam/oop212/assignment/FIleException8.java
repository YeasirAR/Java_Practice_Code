package exam.oop212.assignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FIleException8 {
    public static void main(String[] args) {
        String matchWith;
        String str;
        try {
            FileReader file3 = new FileReader("src/exam/oop212/assignment/file3.txt");
            FileWriter file4 = new FileWriter("src/exam/oop212/assignment/file4.txt");
            BufferedReader br = new BufferedReader(file3);   // using BufferedReader to read file
            BufferedWriter bw = new BufferedWriter(file4);   // using BufferedWriter to write file
            Scanner sc = new Scanner(System.in);
            matchWith = sc.next().toLowerCase();  // Convert the input word to lowercase
            while((str = br.readLine()) != null){ // reading a line from the file in each iteration
                boolean found = false;                // for determining if the word is found or not
                str = str.toLowerCase();                 // Converting the whole line to lowercase
                String[] str_split = str.split(" ");     //splitting the line by space and adding to string array
                ArrayList<Integer> list = new ArrayList<>();   //using arraylist to store the indexes of the word
                for(int i=0; i< str_split.length; i++){
                    if(str_split[i].equals(matchWith)){       // checking if the splitted word is matched with the file
                        list.add(i);                          // adding the index to arraylist
                        found = true;                         // set found to true so that I can write the correct output later
                    }
                }
                if(found) {                                      // Checking if the word is found in splitted strings
                    bw.write("Found " + list + "\n");          // writing to file
                }
                else{                                //If the line doesn't contain the user input word, then write Not Found
                    bw.write("Not Found\n");                  // writing to file
                }
            }
            bw.close();         // closing file // flush the written content to file
            br.close();         // closing reader
        } catch (IOException e){  // Catch exceptions
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
