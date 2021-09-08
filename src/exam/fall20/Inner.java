package exam.fall20;

public class Inner {
    private int a;
    int b;
    static int c;

    class Inner1{
        public void m(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }

    }
    static class Inner2{
        public void m(){
            //System.out.println(a);
            //System.out.println(b);
            System.out.println(c);
        }
    }
}
