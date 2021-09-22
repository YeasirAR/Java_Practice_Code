package AOOP.Lab9;

public class GenericsTest<T> {
    T insVar1;
}

class Main{
    public static void main(String[] args) {
        GenericsTest<Integer> o1 = new GenericsTest<>();
        o1.insVar1 = 1000;

        GenericsTest<String> o2 = new GenericsTest<>();
        o2.insVar1 = "1000";

        GenericsTest<Double> o3 = new GenericsTest<>();
        o3.insVar1 = 5.0555550;
    }
}
