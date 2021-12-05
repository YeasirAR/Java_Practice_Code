package Codes.Exception;

import java.io.File;

public class TestException2
{
	public static void main(String args[]) 
	{
		File file = new File("C://users/temp.txt");
		int a = 10, b = 5, c = 0;
		try {
			 c = a/b;//new ArithmeticException()
			 return;
		} catch(Exception e) {
			System.out.println (e);
		} finally {
			// finally block will always execute
            System.out.println ("In Finally");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);						
	}
}
	