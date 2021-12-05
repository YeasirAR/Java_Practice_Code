package Codes.Exception;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String v = "abc";
        int k = Integer.parseInt(v);
        k = k + 5;
        v = v + 5;
        System.out.println(v);
        System.out.println(k);
//        String v = s.nextLine();
//        int a;
//        a = s.nextInt(); // scanf("%d", &a);
//        System.out.println(a);
//        System.out.println(v);
    }
}
