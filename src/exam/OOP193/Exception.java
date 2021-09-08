package exam.OOP193;

class ExceptionOutput_1 {
    static int p_method(int x , int y){
        int div = 0 ;
        try{
            div = x / y ;
        }catch(NumberFormatException e){
            System.out.println("Catch inside p method");
        }
        return div;
    }
    static int q_method(int x , int y){
        int z = 0;
        try{
            z = p_method(x,y);
        }catch(NumberFormatException e){
            System.out.println("Catch inside q method");
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 10 , b = 0;
        try{
            System.out.println("Exception created..");
            int i = q_method(a,b);
        }catch(ArithmeticException e){
            System.out.println("Exception: " +
                    "Divide by 0");
        }
    }
}