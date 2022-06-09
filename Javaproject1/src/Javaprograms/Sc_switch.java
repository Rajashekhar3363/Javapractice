package Javaprograms;

import java.util.Scanner;

public class Sc_switch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a=s.nextInt();
		System.out.println("Enter the value b:");
		int b=s.nextInt();
		
		int c;
		System.out.println("Enter the  input value :");
		int d=s.nextInt();
		
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition of two numbers :"+c);
			break;
		  case 2:
			c=a-b;
			System.out.println("Subtraction of two numbers "+c);
			break;
		   case 3:
			c=a*b;
			System.out.println("multiplication of two numbers is "+c);
			break;
		   case 4:
				c=a/b;
				System.out.println("multiplication of two numbers is "+c);
			break;
		   case 5:
				c=a%b;
				System.out.println("multiplication of two numbers is "+c);
			break;
			default:
				System.out.println("Invalid inpul give between 1-5");
		}
	}

}
