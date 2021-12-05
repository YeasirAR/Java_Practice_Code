package Codes.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void f() throws Exception {
        Scanner scanner = new Scanner(System.in);
        throw new Exception("I am karim");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            f();
        }
        catch (Exception i) {
            System.out.println(i.getMessage());
        }
        try {
            int a = scanner.nextInt(); // new InputMismatchException();
            String b = scanner.next();
            int c = Integer.parseInt(b); // NumberFormatException
            int k = a / c; // new ArithmeticException();
            System.out.println(k);
        }
        catch (InputMismatchException e) {
            System.out.println("Please input an integer");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Please input a number");
        }
        catch (ArithmeticException f) {
            System.out.println("You can't divide by zero");
            System.out.println(f.getMessage());
        }
        catch (Exception e) {
            System.out.println("Please try again");
        }
    }
}
