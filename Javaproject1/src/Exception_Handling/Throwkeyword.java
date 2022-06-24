package Exception_Handling;

import java.util.Scanner;

public class Throwkeyword  {

	
	public static void main(String[] args) 
	{
		System.out.println("Enter the person Age:");
	      Scanner sc=new Scanner(System.in);
	       int a=sc.nextInt();
		if(a>18)
		{
		throw new Throwsparent_voteligible(" Eligible for Voting  ");
		}
		else
		{
			throw new Throwschild_Not_Eligible(" Eligiblility is above 18 years");
		}

	}

}
