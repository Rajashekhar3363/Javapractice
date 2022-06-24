package Javaprograms;

import java.util.Scanner;

public class Largest_array {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]= {56,16,3,0,27};
		int large=0;
		int min=1;
		 System.out.println(" The values of Arrayas are");
		   for(int j=0;j<a.length;j++)
		   {
			   if(a[j]>large)
			  {
			   large=a[j];
			  }
			   
			  
	}  
			   System.out.println("Largest value is: "+large);
			 
	}	
	}
