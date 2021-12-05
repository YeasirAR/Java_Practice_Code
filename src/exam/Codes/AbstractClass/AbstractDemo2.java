package Codes.AbstractClass;

abstract class Car{
    int reg_no;
    int yearModel;
    abstract void run_engine();
}

class Audi extends Car{
    void run_engine(){
        System.out.println("Audi car's engine work in 6 ways");
    }
}

class Lamborghini extends Car{
    @Override
    void run_engine() {

    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Car car = new Audi();
        car.run_engine();
        car.reg_no = 323;
        Car car1 = new Lamborghini();
        car1.run_engine();
    }
}
