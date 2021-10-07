package AOOP.Lab;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ServerSide {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6601);
            while (true){
                Socket sc = serverSocket.accept();
                ServerCode servercode = new ServerCode(sc);
                Thread t = new Thread(servercode);
                t.start();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
class ServerCode implements Runnable{
    BufferedReader reader;
    BufferedWriter writer;

    ArrayList<Student> stu = new ArrayList<>();
    ServerCode(Socket sc){

        try {
            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            writer = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            reader = new BufferedReader(isr);
            Scanner scanner = new Scanner(new File("src/AOOP/Lab/data.txt"));

            while (scanner.hasNext()){
                Student s = new Student(scanner.nextInt(),scanner.next(),
                        scanner.nextDouble());
                stu.add(s);
            }

            stu.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {

                    if(o1.cgpa > o2.cgpa) return -1;
                    return 1;
                }
            });


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                String str = reader.readLine();
                int i = Integer.parseInt(str)-1;
                if(i<stu.size()){
                    writer.write(stu.get(i).id +" "+ stu.get(i).name +" "+stu.get(i).cgpa+"\n");
                }
                else{
                    writer.write("Invalid Request\n");
                }
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

class Student{
    int id;
    String name;
    double cgpa;

    public Student(int id,String name, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}

// File texts
//        101 Saif 3.52
//        201 Hasan 3.81
//        105 Saif2 3.72
//        206 Hasan2 3.87
//        108 Saif3 3.59
//        209 Hasan4 3.84
//        100 Saif5 3.51
//        202 Hasan6 3.85





