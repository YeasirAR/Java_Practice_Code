package AOOP.Lab6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String name1 = "Pen";
        double price1 = 10;
        String name2 = "Book";
        double price2 = 100;
        String name3 = "Phone";
        double price3 = 500;
        try {

            ServerSocket serverSocket = new ServerSocket(6600);
            Socket sc = serverSocket.accept();

            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            BufferedWriter sWriter = new BufferedWriter(o);


            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            BufferedReader sReader = new BufferedReader(isr);
            while (true) {
                String op = sReader.readLine();
                if (op.equals(name1)) {
                    int quantity = Integer.parseInt(sReader.readLine());
                    double total_price = price1 * quantity;
                    sWriter.write(total_price + "\n");
                    sWriter.flush();
                } else if (op.equals(name2)) {
                    int quantity = Integer.parseInt(sReader.readLine());
                    double total_price = price2 * quantity;
                    sWriter.write(total_price + "\n");
                    sWriter.flush();
                } else if (op.equals(name3)) {
                    int quantity = Integer.parseInt(sReader.readLine());
                    double total_price = price3 * quantity;
                    sWriter.write(total_price + "\n");
                    sWriter.flush();
                } else {
                    sWriter.write("Not Found\n");
                    sWriter.flush();

                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
