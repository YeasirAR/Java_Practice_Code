package lecture4;

class A {
    int i, j;

    void showij() {
        System.out.println(i+" "+j);
    }
}
class B extends A{
    int k;

    void showk() {
        System.out.println(k);
    }

    void sum() {
        System.out.println(i+j+k);
    }
}
class E extends A{
    int m=3;
    void multiply(){
        System.out.println(i*j*m);
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();
     
        B subOb = new B();
	subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        subOb.showij();
        subOb.showk();
        subOb.sum();

        E s=new E();
        s.i=10;
        s.multiply();
        s.sum();
    }
}
