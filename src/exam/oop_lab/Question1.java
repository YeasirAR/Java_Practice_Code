package exam.oop_lab;

import java.util.InputMismatchException;
import java.util.Scanner;
class T{
    int a,b;
    double r1,r2;
    void check(int n) throws InputMismatchException{
        if (n > 100) {
            throw new InputMismatchException();
        }
    }
}


public class Question1 {
    public static void main(String[] args) {
        T t1 = new T();
        Scanner s = new Scanner(System.in);
        t1.a = s.nextInt();
        t1.b = s.nextInt();

        try {
            t1.check(t1.a);
            t1.r1 = t1.a;
        }catch (InputMismatchException e1){
            t1.r1 = t1.a/100.0;
        }

        try {
            t1.check(t1.b);
            t1.r2 = t1.b;
        }catch (InputMismatchException e1){
            t1.r2 = t1.b/100.0;
        }
        System.out.println("Number 1: "+t1.r1+"\n"+"Number 2: "+t1.r2);
        if(t1.r1>t1.r2){
            System.out.println("Number 1 is greater than number 2");
        }
        else
        {
            System.out.println("Number 2 is greater than number 1");
        }
    }

}