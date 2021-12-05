//package Codes.Interface;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//interface Shape2D {
//    double getArea();
//}
//
//class Triangle implements Shape2D {
//    int base, height;
//    Triangle(int a, int b) {
//        base = a;
//        height = b;
//    }
//    @Override
//    public double getArea() {
//        return 0.5 * base * height;
//    }
//}
//
//class Rectangle implements Shape2D {
//    int height, width;
//    Rectangle(int a, int b) {
//        width = a;
//        height = b;
//    }
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//}
//
//public class ClassTest4 {
//    static void compare(Shape2D a, Shape2D b) {
//        if (a.getArea() > b.getArea()) {
//            System.out.println("First one is greater");
//        } else if (a.getArea() < b.getArea()) {
//            System.out.println("Second one is greater");
//        }
//        else {
//            System.out.println("Same Area");
//        }
//    }
//    public static void main (String[] args) {
//        Triangle t = new Triangle(10, 5);
//        System.out.println("Triangle Area: " + t.getArea());
//
//        Rectangle r = new Rectangle(10, 3);
//        System.out.println("Rectangle Area: " + r.getArea());
//
//        compare(t, r);
//        t = new Triangle(10, 10);
//        compare(r, t);
//        compare(t, t);
//        compare(r, r);
//    }
//}
//
//class Test {
//    static String str = "+";
//    public static void main(String[] args) {f1(); }
//    static void f1(){
//        try{
//            f2();
//            throw new Exception();
//        }
//        catch (Exception e){ str += "-";}
//    }
//    static void f2() throws Exception{
//        throw new Exception();
//    }
//}
//
//class Main {
//    static String str = "a";
//    public static void main(String[] args){
//        try{
//            str += "b";
//            System.out.println(str);
//            throw new Exception("Whatever");
//        }
//        catch (Exception e){
//            str += "c";
//            System.out.println(str);
//        }
//        finally{
//            str += "d";
//            System.out.println(str);
//            str += "e";
//        }
//        System.out.println(str);
//    }
//}
//
//public class MyException {
//    public static void main(String[] args){
//        try {
//            int a[]=new int[5];
//            a[5]=10;
//            Integer.parseInt("abc");
//            Scanner scan=new Scanner(System.in);
//            int x=scan.nextInt();
//        } catch (ArrayIndexOutOfBoundsException e) {
//
//        } catch (NumberFormatException e) {
//
//        } catch (InputMismatchException e) {
//
//        }
//    }
//}
//
