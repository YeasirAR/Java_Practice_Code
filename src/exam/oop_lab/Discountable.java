package exam.oop_lab;

import java.util.Scanner;

interface Discountable {
    double discountedPrice();
}
class BestForCustomer implements Discountable{
    private double price;
    private double discount;
    private double tDiscount = 0.10;
    BestForCustomer(double a, double b){
        price = a;
        discount = b/100;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double discountedPrice() {
        if(price>100 && discount>tDiscount){
            price = price - (price*discount);
        }
        else {
            price = price - (price*tDiscount);
        }
        return price;
    }
}

class Main0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        BestForCustomer obj1 = new BestForCustomer(a,b);
        System.out.println(obj1.discountedPrice()+"\n");

        obj1.setPrice(200);
        obj1.discountedPrice();
        System.out.println(obj1.getPrice());
    }
}