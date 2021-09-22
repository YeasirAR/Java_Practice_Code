package AOOP.Lab9;


public class GenericsTest1<T1 extends Number, T2 extends Number, T3 extends Number> {
    T1 insVar1;
    T2 insVar2;
    T3 insVar3;

    public GenericsTest1(T1 insVar1, T2 insVar2, T3 insVar3) {
        this.insVar1 = insVar1;
        this.insVar2 = insVar2;
        this.insVar3 = insVar3;
    }

    double calcAvg(){
        double res = insVar1.doubleValue() + insVar2.doubleValue() + insVar3.doubleValue();
        return res / 3.0;
    }

}

class Main1{
    public static void main(String[] args) {
        GenericsTest1<Integer, Long, Double> test = new GenericsTest1<>(100, 20000000000L, 5.5);
        System.out.println(test.calcAvg());
        System.out.println((100+20000000000L+5.5)/3.0);
    }
}
