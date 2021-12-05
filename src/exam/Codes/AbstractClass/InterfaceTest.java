package Codes.AbstractClass;

interface Student {
    int f = 5;
    void g();
    void h();
}
interface Teacher extends Student{
    void k();
}
class CD implements Teacher {
    public void g() {
        System.out.println("In g");
    }
    public void h() {
        System.out.println("In h");
    }
    public void k() {
        System.out.println("In k");
    }
}
class AB extends CD {

}
public class InterfaceTest {
    public static void main(String[] args) {
        Student t = new AB();
        t.g();
        System.out.println(Student.f);
    }
}
