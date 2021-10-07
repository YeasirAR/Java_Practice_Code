package exam;

class InnerClass {
    int x;

    public InnerClass(int x) {
        this.x = x;
    }

    public InnerClass() {

    }

    void add(int x){

    }

}
class InnerTest{
    public static void main(String[] args) {
        InnerClass i = new InnerClass(){
            void add(){

            }
        };
    }
}
