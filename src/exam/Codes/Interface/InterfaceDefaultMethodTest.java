package Codes.Interface;

interface MyIF {
    // This is a "normal" interface method declaration.
    int getNumber();
    // This is a default method. Notice that it provides
    // a default implementation.
    default String getString() {
        return "Default String";
    }
}

class MyIFImp implements MyIF {
    // Only getNumber() defined by MyIF needs to be implemented.
    // getString() can be allowed to default.
    public int getNumber() {
        return 100;
    }
    //public String getString(){return "5";};
}

public class InterfaceDefaultMethodTest {
    public static void main(String[] args) {
        MyIFImp m = new MyIFImp();
        MyIF c;
        c=m;
        System.out.println(c.getNumber());
        System.out.println(c.getString());
    }
}
