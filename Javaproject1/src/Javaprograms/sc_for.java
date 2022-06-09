package Javaprograms;

import java.util.Scanner;

public class sc_for {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Input a:");
		int a=s.nextInt();
		System.out.println("Input b:");
		int b=s.nextInt();
		System.out.println("Input c:");
		int c=s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a value is Bigger");
			}
		else if(b>a && b>c)
		{
			System.out.println("b value is Bigger");
		}
		else {
			System.out.println("c value is Bigger");	
		}

	}

}
