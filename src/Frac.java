
class Frac{
    int num;
    int denum;

    Frac(int num, int denum){
        this.num = num;
        this.denum = denum;
    }

    public String toString(){
        return num+"/"+denum;
    }

    public Frac add(Frac f2) {
        return f2;
    }
}

class Main{
    public static void main(String[] args){

        Frac f1 = new Frac(2,3);
        Frac f2 = new Frac(1,4);
        Frac f3 = f1.add(f2); // 1/3 + 1/3 = 2/3
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3); //2,3 "2/3"
    }
}
