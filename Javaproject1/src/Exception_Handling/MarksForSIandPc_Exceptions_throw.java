package Exception_Handling;

import java.util.Scanner;

public class MarksForSIandPc_Exceptions_throw extends RuntimeException
{
	MarksForSIandPc_Exceptions_throw (String s)
	{
		super(s);
	}
	
	
	
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	
	   System.out.println("Enter the marks:");
	   int a=sc.nextInt();
	   if(a<100 && a>=70)
	   {
		   throw new Marks_in_SI_Ex1("This person is not Eligible for SI job");
	   }
	   else if(a<=70)
	   {
		   throw new Marks_in_Pc_Ex1("This person is not Eligible for PC job");
	   } 
	   else
	   {
		   throw new MarksForSIandPc_Exceptions_throw("This person is Eligible for SI job ans PC");
	   }
	}
}
