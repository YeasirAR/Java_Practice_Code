package Codes.Interface;

interface Student {
    int age = 0;//
    void f();
    void g();
}
interface Person {
    void k();
}

interface Teacher extends Student, Person{
    void h();// f(), g(), k()
}

class AB implements Teacher {
    static int f;


    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    public void h() {

    }


    @Override
    public void k() {

    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        Teacher t;
        t = new AB();
    }
}
