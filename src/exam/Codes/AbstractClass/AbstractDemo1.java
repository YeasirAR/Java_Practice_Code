package Codes.AbstractClass;

import java.lang.*;
import java.lang.Override;

abstract class S {
    S(){
        System.out.println("fg");//abstract class can have constructor but interface can't have
    }
    abstract void call();
    // concrete methods are still allowed in abstract classes
    void call2() {
        System.out.println("This is a concrete method");
    }
}

class T extends S {
    T() {super();}
    void call() {
        System.out.println("T's implementation of call");
    }
    void f() {
        System.out.println("in f");
    }
}
class AbstractDemo {
    public static void main(String args[]) {
        S s = new T();
        s.call();
        ((T)s).f();
    }
}


/*class R implements T{//only interface can be implemented

    @Override
    void call() {

    }
}*/
/*class M implements S{

    @Override
    void call() {

    }
}*/
