package Codes.Exception;

class Child extends Parent {
    public int childVariable = 5;
    public void childMethod() {
        parentMethod();
        System.out.printf( "In Child Parent Variable=%d, ChildVariable=%d\n",
                parentVariable, childVariable );
    }
}
class Inheritance {
    public static void main( String args[] ) {
        Child example = new Child();
        example.childMethod();
        example.parentMethod();
        System.out.println( example.parentVariable );
    }
}