package exam.oop_lab;

abstract class Ques4 {
    Ques4(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void non_abstract(){
        System.out.println("This is a normal method of abstract class ");
    }

}
class SubClass extends Ques4{

    void a_method() {
        System.out.println("This is abstract Method");
    }
}
class MainX{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.a_method();
        s.non_abstract();
    }
}