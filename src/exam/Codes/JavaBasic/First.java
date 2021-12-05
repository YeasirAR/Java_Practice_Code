package lecture11;

public class First {
    public static void main(String[] args) {
        // This is single line Java comment
        /* This is multi-line Java
        comment */
        System.out.println("Hello World");

        // variable declaration
        // type variable = value;
        // String, int, long, byte, short, float, double, char, boolean
        int myNum = 5;
        System.out.println(myNum); // Display variable value
        long myLongNum = 15000000000L;
        System.out.println(myLongNum);
        float myFloatNum = 5.9911111111111111111111111111111111f;
        System.out.println(myFloatNum);
        myFloatNum = myNum;
        System.out.println(myFloatNum);
        byte myByteNum = 30;
        System.out.println(myByteNum);
        double myDoubleNum = 35;
        System.out.println(myDoubleNum);
        System.out.println(((Object)myByteNum).getClass().getName());
        char myLetter = '\r';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
        String myText = "stackoverflow\rnine";
        System.out.print(myText);
//        final byte myFinalShortNum = 5;
//        myFinalShortNum = 6;

        final byte minusOne = 45;
        System.out.println("minusOne " + minusOne);

        // Automatic Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Manual Casting
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9

        // ?
        int x = 10;
        int y = 9;
        System.out.println(x > y);

        // If-else statement
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // For loop
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Break
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Continue
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // One dimensional array
        int[] myArray = {10, 20, 30, 40};
        System.out.println(myArray[0]);
        myArray[0] = 60;
        System.out.println(myArray[0]);
        System.out.println(myArray.length);

        // Multi dimensional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };
        int a = myNumbers[1][2];
        System.out.println(a);

        int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println(Sum(5, 6));
    }
    static int Sum(int a, int b) {
        return a+b;
    }
}
