package Codes.Interface;

/**
 * Created by hp on 1/20/2016.
 */
interface A{
    default void r(){
        System.out.println("A");
    }
}
interface B{
    default void h(){
        System.out.println("B");
    }
    default void r(){
        System.out.println("B");
    }
}
class G implements B,A{ // r, h
    public void r(){
        System.out.println("G");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        G g=new G();
        g.r();// G
        g.h();// B
        A a;
        B b;
        a=g;
        a.r();// G
        b=g;
        b.r();// G
    }
}
