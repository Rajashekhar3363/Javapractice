package Exception_Handling;


public class Finallykeyword {

	public static void main(String[] args)  
	{
		int a[]= {15,20,30,41,10};
		try {
			System.out.println("Hi Balu");
			System.out.println(a[1]);
		     }
		catch(ArrayIndexOutOfBoundsException ae)
		    {
			System.out.println("ArrayIndexOutOfBoundsException ae");
		    }
		catch(ArithmeticException ari)
		    {
			System.out.println("ArithmeticException ari");
		    }
		catch(Exception e)
		  {
			System.out.println("Exception e");
		  }
		finally {
			System.out.println("Ednded");
		}
	}
}
