package AOOP.Lab9;



import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class University{
    String name;
    int studentsCount;
    int facultyCount;

    public University(String name, int studentsCount, int facultyCount) {
        this.name = name;
        this.studentsCount = studentsCount;
        this.facultyCount = facultyCount;
    }
}

class Sorting{
    public static void main(String[] args) {
        ArrayList<University> university = new ArrayList<>();

//        University ob1 = new University("UIU",5000,100);
//        University ob2 = new University("DIU",9000,200);
//        University ob3 = new University("AIUB",6000,150);
//        University ob4 = new University("BUBT",4000,70);
//        University ob5 = new University("NSU",15000,400);
//        university.add(ob1);
//        university.add(ob2);
//        university.add(ob3);
//        university.add(ob4);
//        university.add(ob5);


        try{
            Scanner sc = new Scanner(new File("src/AOOP/Lab9/data2.txt"));
            while (sc.hasNext()){
                University u = new University(sc.next(), sc.nextInt(), sc.nextInt());
                university.add(u);
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        university.sort(new Comparator<University>() {
            @Override
            public int compare(University o1, University o2) {
                if(o1.studentsCount > o2.studentsCount)
                    return -1;
                return 1;
            }
        });
        try {
            FileOutputStream f = new FileOutputStream("src/AOOP/Lab9/data.txt");
            ObjectOutputStream ow = new ObjectOutputStream(f);
            ow.writeObject(university);
            ow.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}