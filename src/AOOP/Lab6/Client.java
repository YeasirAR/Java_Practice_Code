package AOOP.Lab6;

import java.io.*;
import java.net.Socket;


public class Client {
    BufferedReader cReader;
    BufferedWriter cWriter;

    public Client() throws IOException {
        Socket sc = new Socket("localhost", 6600);

        OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
        cWriter = new BufferedWriter(o);

        InputStreamReader isr = new InputStreamReader(sc.getInputStream());
        cReader = new BufferedReader(isr);

    }
    public void Client_method(String name, int quantity) throws IOException {
        cWriter.write(name + "\n");
        cWriter.write(quantity + "\n");
        cWriter.flush();
        String total_price = cReader.readLine();
        System.out.println("Total Price of "+name+" is :"+total_price);
    }



    public static void main(String[] args) throws IOException {
        Client c = new Client();
        c.Client_method("Pen",5);

    }
}
