package exam.fall20;

public class exception {
    public static void main(String[] args) {
        exception1 ex = new exception1();
        ex.assign(5,17);
    }
}
class exception1{
    public static void assign(int id, int age){
        try{
            validate(age);
            System.out.println("assigned " + id + " to work");
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }

    static void validate(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("DIs is magic");
        }
    }


}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String ses) {
        super(ses);
    }
}