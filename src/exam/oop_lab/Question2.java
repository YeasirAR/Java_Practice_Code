package exam.oop_lab;

import java.awt.geom.IllegalPathStateException;
import java.util.Scanner;

class ExceptionT4{
    void testMethod(int num) throws IllegalPathStateException{
        if(num<0){
            throw new IllegalPathStateException("Please Enter Positive Number");
        }
        else {
            if(num%3==0){
                System.out.println("The number is multiple of 3");
            }
        }
    }

}

public class Question2 {
    public static void main(String[] args) {
        ExceptionT4 ex = new ExceptionT4();
        Scanner s = new Scanner(System.in);

        try {
            ex.testMethod(s.nextInt());
        }
        catch (IllegalPathStateException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
