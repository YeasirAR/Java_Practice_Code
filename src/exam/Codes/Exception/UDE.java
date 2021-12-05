package Codes.Exception;

class CustomException extends Exception {
    CustomException() {
        super();
    }
    CustomException(String msg) {
        super(msg);
    }
    CustomException(int a) {
        super("The number is: "+a);
    }
}
public class UDE {
    public static void main(String[] args) {
        int N = 24;
        int [] divisors = {2, 1, 0, 4};
        try {
            for (int i = 0; i < 6; i++) {
                try {
                    int div = divisors[i];
                    int x = N / div;
                    System.out.println("Success");
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception caught");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBoundException caught");
        }

    }
}
