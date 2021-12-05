package Codes.Exception;

public class TestException1
{
	public static void main (String args[]) {
		int a = -10;
		float b = 0.0f;
		try {
		    throw new Error();

        }catch (Exception e){
            System.out.println("Df");
        }
		finally {
            System.out.println("gfgf");
        }
        System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}	
