package Codes.Exception;
/*
Write a custom Exception InvalidAgeException that will be thrown
if the validate() method receives a parameter that is less than 18.
 */

public class CustomException1 {
    static void validate(int age) {
        if (age < 18){
            // throw InvalidAgeException
        }
        else
            System.out.println("Welcome to vote");
    }
    public static void main(String[] args) {
        validate(13);
    }
}
