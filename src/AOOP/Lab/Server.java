package AOOP.Lab;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String fileName1 = "AOOP/Lab/file1.txt";
        String fileName2 = "AOOP/Lab/file2.txt";
        String fileName3 = "AOOP/Lab/file3.txt";
        try {

            ServerSocket serverSocket = new ServerSocket(6600);
            Socket sc = serverSocket.accept();

            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            BufferedWriter sWriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            BufferedReader sReader = new BufferedReader(isr);
            while (true) {
                String fileName = sReader.readLine();

                if (fileName.equals(fileName1) || fileName.equals(fileName2)
                        ||fileName.equals(fileName3)) {
                    BufferedReader reader2 = new BufferedReader(new FileReader(fileName));
                    String temp = reader2.readLine();
                    while(temp!=null){
                        sWriter.write(temp+"\n");
                        temp = reader2.readLine();
                    }

                } else {
                    sWriter.write("File Not Found\n");

                }
                sWriter.flush();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
