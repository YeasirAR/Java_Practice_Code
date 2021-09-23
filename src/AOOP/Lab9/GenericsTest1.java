package AOOP.Lab9;


class Generics<T1 extends Number, T2 extends Number> {
    T1 insVar1;
    T2 insVar2;

    public Generics(T1 insVar1, T2 insVar2) {
        this.insVar1 = insVar1;
        this.insVar2 = insVar2;
    }

    double sum(){
        return insVar1.doubleValue() + insVar2.doubleValue();
    }

}

class Main1{
    public static void main(String[] args) {
        Generics <Double, Double> o = new Generics<>(100.0, 200.0);
        System.out.println(o.sum());
    }
}
