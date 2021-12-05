package exam;

public class CT {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Magpie();
        Magpie c = (Magpie) b;
        a.fly();
        b.fly();
        ((Magpie)b).fly(15);
        c.fly();
        a.eat();
        b.eat();
        c.eat();
    }
}
class Animal{
    Animal(){
        System.out.println("An animal is created.");
    }
    void fly(){
        System.out.println("Dont know if I can fly!");
    }
    void eat(){
        System.out.println("Eating");
    }
}
class Bird extends Animal{
    Bird(){
        System.out.println("A bird is created.");
    }
    void fly(){
        System.out.println("Flying..");
    }
}
class Magpie extends Bird{
    Magpie(){
        System.out.println("A magpie is created.");
    }
    void fly(){
        System.out.println("Magpie is flying..");
    }
    void eat(){
        System.out.println("Magpie is eating..");
    }
    void fly(int speed){
        System.out.println("Magpie is flying at speed: "+speed);
    }
}

class Fruit{
    int name;
    double weight;
    double kgprice;
    double totalprice;
    Fruit(int n, double w,double p){
        name=n;
        weight=w;
        kgprice=p;
    }
    void printDetails(){
        totalprice=weight*kgprice;
        System.out.println("Fruit Details: ");
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight);
        System.out.println("Price per kg: "+kgprice);
        System.out.println("Total price: "+totalprice);
    }
    void reducePricePerKG(int decrease){
        kgprice = kgprice+ decrease;
    }
    void increasePricePerKG(int increase){
        kgprice = kgprice + increase;
    }
}