package exam.oop212;

abstract class ABS{
    ABS(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void non_abs_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
class Subclass extends ABS{

    void a_method() {
        System.out.println("This is abstract method");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        ABS a = new Subclass();
        a.a_method();
        a.non_abs_method();
    }
}
