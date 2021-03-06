package AOOP.Lab6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server is waiting for client.");
            ServerSocket serverSocket = new ServerSocket(6600);
            Socket sc = serverSocket.accept();

            System.out.println("Connection established with client!");

            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            BufferedWriter sWriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            BufferedReader sReader = new BufferedReader(isr);

            while (true){
                String op = sReader.readLine();
                if(op.equals("add")){
                    String num1 = sReader.readLine();
                    String num2 = sReader.readLine();

                    double n1 = Double.parseDouble(num1);
                    double n2 = Double.parseDouble(num2);

                    double result = n1 + n2;
                    System.out.println(n1 + " " + n2 + " " + result);

                    sWriter.write(result + "\n");
                    sWriter.flush();
                }
                if(op.equals("multiply")){
                    String num1 = sReader.readLine();
                    String num2 = sReader.readLine();

                    double n1 = Double.parseDouble(num1);
                    double n2 = Double.parseDouble(num2);

                    double result = n1 * n2;
                    System.out.println(n1 + " " + n2 + " " + result);

                    sWriter.write(result + "\n");
                    sWriter.flush();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
