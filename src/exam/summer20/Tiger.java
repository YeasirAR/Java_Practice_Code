package exam.summer20;


class Parent{
    private int var1;
    private int var2;

    public Parent(int var1,int var2){
        this.var1 = var1;
        this.var2 = var2;
    }
    void display(){
        System.out.println(var1+" "+var2);
    }

}
class Child extends Parent{
    int var3;

    public Child(int var1, int var2) {
        super(var1, var2);
    }
    public Child(int var1, int var2, int var3) {
        this(var1, var2);
        this.var3=var3;
    }
    void display(){
        super.display();
        System.out.println(var3);
    }
}
class Main_s{
    public static void main(String[] args) {
        Child c =new Child(10,20,30);
        c.display();
    }
}