package AOOP.Lab7;

import AOOP.Lab7.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

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
class Client implements Runnable{
    String clientName;
    BufferedReader reader;
    BufferedWriter writer;

    final static ArrayList<Client> clients = new ArrayList<>();

    Client(Socket sc){
        try {
            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            writer = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            reader = new BufferedReader(isr);

            clientName = reader.readLine();
            clients.add(this);

            System.out.println("Client " + clientName + " connected.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        while(true){
            try {
                String data = reader.readLine();
                data = clientName + ": " + data + "\n";
                synchronized (clients){
                    for(Client client: clients){
                        client.writer.write(data);
                        client.writer.flush();
                    }
                }
            }
            catch (SocketException e){
                break;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


