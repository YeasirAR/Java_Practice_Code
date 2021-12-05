package Codes.Interface;

/**
 * Created by hp on 1/20/2016.
 */
interface C{
    default void r(){
        System.out.println("A");
    }
}
interface D extends C{
    default void h(){
        System.out.println("B");
    }
    default void r(){
        System.out.println("B");
    }
}
class H implements D,C{
    public void h(){
        System.out.println("G");
    }
}
public class MultipleInheritance2 {
    public static void main(String[] args) {
        H g=new H();
        g.r();
        g.h();
        C a;
        D b;
        a=g;
        a.r();
        b=g;
        b.r();
    }
}
