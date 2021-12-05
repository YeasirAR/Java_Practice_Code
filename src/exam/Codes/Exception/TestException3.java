package Codes.Exception;

public class TestException3
{
	public static void f()  throws Exception {
		int a = 10;
		int b = 0;
		int c = a/b;
	}
	public static void g() {
		try {
			f();
		} catch (Exception e) {
			System.err.println("DFDF" + e.toString());
			System.out.println("In G");
			System.out.println(e.toString());
		}
		System.out.println("In G");
	}
	public static void main(String args[])
	{
		g();
		System.out.println("Hello World");
	}
}	
		
