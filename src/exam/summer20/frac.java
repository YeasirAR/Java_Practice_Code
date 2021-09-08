package exam.summer20;

class Fraction{
    int num,denom;
    Fraction(){
        num=1;
        denom=2;
    }
    Fraction(int num,int denom){
        this.num=num;
        this.denom=denom;
    }
    public String toString(){

        return num+"/"+denom;
    }
}

public class frac {
    public static void main(String[] args) {
            Fraction f1 = new Fraction();
            System.out.println(f1);
            Fraction f2 = new Fraction(2, 5);
            System.out.println(f2);
        }
}
