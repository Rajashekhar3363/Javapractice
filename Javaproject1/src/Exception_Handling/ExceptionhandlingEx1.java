package Exception_Handling;

public class ExceptionhandlingEx1
{
public static void main(String[] args) 
{
	/*int a=20;
	  int b=5;
	  int c;
		
		  System.out.println("Before catch block");
		try 
		{
			
			System.out.println("the divding of "+a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
		}
		System.out.println("After catch block");
	}
*/

int arr[]= {10,20,30,40,500};

System.out.println("the element "+arr[1]);
try
{
	System.out.println(arr.length);
}
catch(ArithmeticException ae)
{
	System.out.println(ae.getMessage()+"1catch");
}
catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println("2catch"+a.getMessage());
}
catch(Exception e)
{
	System.out.println(e.getMessage()+"3catch");
}
System.out.println("the value of index is "+arr[arr.length-1]);
}
}