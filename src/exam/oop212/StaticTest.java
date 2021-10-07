package exam.oop212;

// Static variable

class Bird12{
    // static variables is not created for each object,
    // it is created once for the class. Only one copy of static variable will exist.
    static String name = "Bird";
    String color;

    void fnc(){
        name = "A Bird";
    }

    void fnc1(){
        System.out.println(name);
    }
}

class StaticTest2 {
    public static void main(String[] args) {
        // static variables can be accessed without creating an object.
        // We should access it by writing the className.variableName.
        System.out.println(Bird1.name);
        Bird1 b = new Bird1();
        b.fnc();
        System.out.println(Bird1.name);
        b.name = "B Bird";  // accessing static variables using reference is not recommended
        b.fnc1();
    }
}










// static method

class Bird1{
    // static variables is not created for each object,
    // it is created once for the class. Only one copy of static variable will exist.
    static String name = "Bird";
    String color;

    void fnc(){
        name = "A Bird";
    }

    void fnc1(){
        color = "ab";
        fnc();
        System.out.println(name);
    }

    static void fnc2(){
        // Inside static method, we can not access non static members of the class.
//        color = "ab";
//        fnc();

        // To access non static members, we need to create an object.
        Bird1 br = new Bird1();
        br.color = "ab";
        br.fnc();
        name = "A Bird";

        System.out.println("IN fnc 2");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        // static methods can be called without creating an object of the class.
        // className.methodName();
        Bird1.fnc2();
        Bird1 b = new Bird1();
        b.fnc1();

        System.out.println(Math.PI);
        double sq = Math.sqrt(25);
        System.out.println(sq);
    }
}







// Final keyword

// Final keyword can be used in 3 places
// 1. Before variables: Can not change it (more than once)
// 2. Before methods: Stops method overriding
// 3. Before class: Stops inheritance for the class


final class Test12{
    // for non static variable, we can either initialize during declaration
    // or in the constructor
    final int a;

    // for static variable, must initialize during declaration
    static final int b = 50;

    Test12(){
        final int b = 10;
        a = 54;
    }

    final void fnc(){
        System.out.println(Math.PI);
    }
}

// Test1 final class can not be inherited
//class CTest1 extends Test1{
//     //can not override fnc(), because it is final in the parent
//    void fnc(){ }
//}


