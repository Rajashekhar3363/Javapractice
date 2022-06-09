package Javaprograms;

import java.util.Scanner;

public class Sumof_naturalnum {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the input:");
			int c=sc.nextInt();
			int d=0;
			for(int i=1;i<=c;i++)
			{
				 d=i+d;
				 
			}
	    System.out.println("The sum of natural num :1+2+3+4+5="+d);


	}

}
