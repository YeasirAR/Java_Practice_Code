package AOOP.Lab7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server is waiting for client.");
            ServerSocket serverSocket = new ServerSocket(6601);

            while (true){
                Socket sc = serverSocket.accept();
                Client client = new Client(sc);
                Thread t = new Thread(client);
                t.start();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

